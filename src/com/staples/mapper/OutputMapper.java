package com.staples.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.staples.domain.Output;

public interface OutputMapper {

	Output selectByPrimaryKey(BigDecimal id);

	int theSum(Map<String, Object> params);
	
	List<Output> getAllUpdatedInfo();

	List<Output> selectByPrimaryKey(int id);

}