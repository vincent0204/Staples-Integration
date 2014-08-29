package com.staples.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.staples.domain.Output;

public interface OutputMapper {
	
	List<Output> getAllUpdatedInfo(RowBounds rowBounds);
	
	int getCountOfUpdatedInfo();

	List<Output> selectByPrimaryKey(int id);
	
	int updateOutputStatus();
	
	int getStatusTrack();
}