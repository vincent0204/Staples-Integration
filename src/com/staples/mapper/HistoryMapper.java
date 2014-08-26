package com.staples.mapper;

import com.staples.domain.History;
import com.staples.domain.HistoryExample;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface HistoryMapper {
    int insert(History record);

    int insertSelective(History record);

    List<History> selectByExample(HistoryExample example);
    
    int getCountOfInsertedInfo();
    
    List<History> getAllInsertedInfo(RowBounds bounds);
}