package com.staples.mapper;

import java.util.List;
import java.util.Map;

import com.staples.domain.Output;

public interface OutputMapper {
	int theSum(Map<String, Object> params);

	List<Output> getAllUpdatedInfo();

	List<Output> selectByPrimaryKey(int id);
	
	int updateOutputStatusY();

	int updateOutputStatusN();
}