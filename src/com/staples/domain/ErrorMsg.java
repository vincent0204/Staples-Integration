package com.staples.domain;

public class ErrorMsg {
	
	private String name;
	private String errorMsg;
	private String logFile;
	private String errorDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getLogFile() {
		return logFile;
	}
	public void setLogFile(String logfile) {
		this.logFile = logfile;
	}
	public String getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(String errorDate) {
		this.errorDate = errorDate;
	}
	
}
