package com.staples.bulk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.sforce.async.AsyncApiException;
import com.sforce.async.BatchInfo;
import com.sforce.async.BatchStateEnum;
import com.sforce.async.BulkConnection;
import com.sforce.async.CSVReader;
import com.sforce.async.ContentType;
import com.sforce.async.JobInfo;
import com.sforce.async.JobStateEnum;
import com.sforce.async.OperationEnum;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class BulkUtil {
	
	private static final String SAP_EXTERNAL_FIELD = "SAP_Number__c";//SAP_Number__c, SAP_His_External_ID__c
	private static final int MAX_BYTES_PER_BATCH = 5000000;
	private static final int MAX_ROWS_PER_BATCH = 5000;
	private static final String LINE_END = "\n";
	private static final String UTF_8 = "UTF-8";
	private static final String API_VERSION = "30.0";
	private static final Logger logger = Logger.getLogger(BulkUtil.class);
	
	private BulkConnection connection;

	public BulkUtil(String userName, String password, String url){
		try {
			connection = this.getBulkConnection(userName, password, url);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} 
	}

	/**
	 * Creates a Bulk API job and uploads batches for a CSV file.
	 */
	public boolean runJob(String sobjectType, OperationEnum operation, String file) throws AsyncApiException,
			ConnectionException, IOException {
		JobInfo job = createJob(sobjectType, operation);
		logger.info(job);
		List<BatchInfo> batchInfoList = createBatchesFromCSVFile(job, file);
		closeJob(job.getId());
		return checkResults(job, batchInfoList);
	}
	
	/**
	 * Gets the results of the operation and checks for errors.
	 */
	public boolean checkResults(JobInfo job, List<BatchInfo> batchInfoList) throws AsyncApiException,
			IOException {
		
		boolean isSuccess = true;
		// batchInfoList was populated when batches were created and submitted
		for (BatchInfo b : batchInfoList) {
			CSVReader rdr = new CSVReader(connection.getBatchResultStream(
					job.getId(), b.getId()));
			List<String> resultHeader = rdr.nextRecord();
			int resultCols = resultHeader.size();
			List<String> row;
			while ((row = rdr.nextRecord()) != null) {
				Map<String, String> resultInfo = new HashMap<String, String>();
				for (int i = 0; i < resultCols; i++) {
					resultInfo.put(resultHeader.get(i), row.get(i));
				}
				boolean success = Boolean.valueOf(resultInfo.get("Success"));
				boolean created = Boolean.valueOf(resultInfo.get("Created"));
				String id = resultInfo.get("Id");
				String error = resultInfo.get("Error");
				if (success && created) {
					logger.info("Created row with id " + id);
				} else if (!success) {
					isSuccess = false;
					logger.info("Failed with error: " + error);
				}
			}
		}
		
		return isSuccess;
	}

	public void closeJob(String jobId)
			throws AsyncApiException {
		JobInfo job = new JobInfo();
		job.setId(jobId);
		job.setState(JobStateEnum.Closed);
		connection.updateJob(job);
	}

	/**
	 * Wait for a job to complete by polling the Bulk API.
	 * 
	 * @param connection
	 *            BulkConnection used to check results.
	 * @param job
	 *            The job awaiting completion.
	 * @param batchInfoList
	 *            List of batches for this job.
	 * @throws AsyncApiException
	 */
	public void awaitCompletion(JobInfo job, List<BatchInfo> batchInfoList) throws AsyncApiException {
		long sleepTime = 0L;
		Set<String> incomplete = new HashSet<String>();
		for (BatchInfo bi : batchInfoList) {
			incomplete.add(bi.getId());
		}
		while (!incomplete.isEmpty()) {
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
			logger.info("Awaiting results..." + incomplete.size());
			sleepTime = 10000L;
			BatchInfo[] statusList = connection.getBatchInfoList(job.getId())
					.getBatchInfo();
			for (BatchInfo b : statusList) {
				if (b.getState() == BatchStateEnum.Completed
						|| b.getState() == BatchStateEnum.Failed) {
					if (incomplete.remove(b.getId())) {
						logger.info("BATCH STATUS:\n" + b);
					}
				}
			}
		}
	}

	/**
	 * Create a new job using the Bulk API.
	 * 
	 * @param sobjectType
	 *            The object type being loaded, such as "Account"
	 * @param connection
	 *            BulkConnection used to create the new job.
	 * @return The JobInfo for the new job.
	 * @throws AsyncApiException
	 */
	public JobInfo createJob(String sobjectType, OperationEnum operation)
			throws AsyncApiException {
		JobInfo job = new JobInfo();
		job.setObject(sobjectType);
		job.setOperation(operation);
		job.setContentType(ContentType.CSV);
		job.setExternalIdFieldName(SAP_EXTERNAL_FIELD);
		job = connection.createJob(job);
		logger.info(job);
		return job;
	}
	
	/**
	 * Create the BulkConnection used to call Bulk API operations.
	 */
	private BulkConnection getBulkConnection(String userName, String password, String url)
			throws ConnectionException, AsyncApiException {
		ConnectorConfig partnerConfig = getPartnerConfig(userName, password, url);
		
		ConnectorConfig config = new ConnectorConfig();
		config.setSessionId(partnerConfig.getSessionId());
		// The endpoint for the Bulk API service is the same as for the normal
		// SOAP uri until the /Soap/ part. From here it's '/async/versionNumber'
		String soapEndpoint = partnerConfig.getServiceEndpoint();
		String restEndpoint = soapEndpoint.substring(0,	soapEndpoint.indexOf("Soap/"))
				+ "async/" + API_VERSION;
		config.setRestEndpoint(restEndpoint);
		// This should only be false when doing debugging.
		config.setCompression(false);
		// Set this to true to see HTTP requests and responses on stdout
		config.setTraceMessage(false);
		BulkConnection connection = new BulkConnection(config);
		return connection;
	}

	private ConnectorConfig getPartnerConfig(String userName,
			String password, String url) throws ConnectionException {
		ConnectorConfig partnerConfig = new ConnectorConfig();
		partnerConfig.setUsername(userName);
		partnerConfig.setPassword(password);
		partnerConfig.setAuthEndpoint(url);
		// Creating the connection automatically handles login and stores
		// the session in partnerConfig
		// When PartnerConnection is instantiated, a login is implicitly
		// executed and, if successful,
		// a valid session is stored in the ConnectorConfig instance.
		// Use this key to initialize a BulkConnection:
		new PartnerConnection(partnerConfig);
		
		return partnerConfig;
	}

	/**
	 * Create and upload batches using a CSV file. The file into the appropriate
	 * size batch files.
	 * 
	 * @param connection
	 *            Connection to use for creating batches
	 * @param jobInfo
	 *            Job associated with new batches
	 * @param csvFileName
	 *            The source file for batch data
	 */
	public List<BatchInfo> createBatchesFromCSVFile(JobInfo jobInfo, String csvFileName) throws IOException,
			AsyncApiException {
		List<BatchInfo> batchInfos = new ArrayList<BatchInfo>();
		BufferedReader rdr = new BufferedReader(new InputStreamReader(
				new FileInputStream(csvFileName)));
		// read the CSV header row
		byte[] headerBytes = (rdr.readLine() + LINE_END).getBytes(UTF_8);
		int headerBytesLength = headerBytes.length;
		File tmpFile = File.createTempFile("bulkAPIInsert", ".csv");
		// Split the CSV file into multiple batches
		try {
			FileOutputStream tmpOut = new FileOutputStream(tmpFile);
			int currentBytes = 0;
			int currentLines = 0;
			String nextLine;
			while ((nextLine = rdr.readLine()) != null) {
				byte[] bytes = (nextLine + LINE_END).getBytes(UTF_8);
				// Create a new batch when our batch size limit is reached
				if (currentBytes + bytes.length > MAX_BYTES_PER_BATCH
						|| currentLines > MAX_ROWS_PER_BATCH) {
					createBatch(tmpOut, tmpFile, batchInfos, connection,
							jobInfo);
					currentBytes = 0;
					currentLines = 0;
				}
				if (currentBytes == 0) {
					tmpOut = new FileOutputStream(tmpFile);
					tmpOut.write(headerBytes);
					currentBytes = headerBytesLength;
					currentLines = 1;
				}
				tmpOut.write(bytes);
				currentBytes += bytes.length;
				currentLines++;
			}
			// Finished processing all rows
			// Create a final batch for any remaining data
			if (currentLines > 1) {
				createBatch(tmpOut, tmpFile, batchInfos, connection, jobInfo);
			}
		} finally {
			tmpFile.delete();
			rdr.close();
		}
		return batchInfos;
	}

	/**
	 * Create a batch by uploading the contents of the file. This closes the
	 * output stream.
	 * 
	 * @param tmpOut
	 *            The output stream used to write the CSV data for a single
	 *            batch.
	 * @param tmpFile
	 *            The file associated with the above stream.
	 * @param batchInfos
	 *            The batch info for the newly created batch is added to this
	 *            list.
	 * @param connection
	 *            The BulkConnection used to create the new batch.
	 * @param jobInfo
	 *            The JobInfo associated with the new batch.
	 */
	private void createBatch(FileOutputStream tmpOut, File tmpFile,
			List<BatchInfo> batchInfos, BulkConnection connection,
			JobInfo jobInfo) throws IOException, AsyncApiException {
		tmpOut.flush();
		tmpOut.close();
		FileInputStream tmpInputStream = new FileInputStream(tmpFile);
		try {
			BatchInfo batchInfo = connection.createBatchFromStream(jobInfo,
					tmpInputStream);
			logger.info("salesforce batch Id: " + batchInfo.getId());
			batchInfos.add(batchInfo);
		} finally {
			tmpInputStream.close();
		}
	}
}
