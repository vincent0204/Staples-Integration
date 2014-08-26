package com.staples.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.staples.domain.Output;

public interface OutputMapper {
	int theSum(Map<String, Object> params);

	List<Output> getAllUpdatedInfo(RowBounds rowBounds);
	
	int getCountOfUpdatedInfo();

	List<Output> selectByPrimaryKey(int id);
	
	int updateOutputStatusY();

	int updateOutputStatusN();
}