package com.staples.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.staples.domain.History;

public interface HistoryMapper {
    int insert(History record);

    int insertSelective(History record);

    int getCountOfInsertedInfo();
    
    List<History> getAllInsertedInfo(RowBounds bounds);
}