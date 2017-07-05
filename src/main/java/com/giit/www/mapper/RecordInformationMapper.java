package com.giit.www.mapper;

import com.giit.www.entity.RecordInformation;

public interface RecordInformationMapper {
    int deleteByPrimaryKey(String casenumber);

    int insert(RecordInformation record);

    int insertSelective(RecordInformation record);

    RecordInformation selectByPrimaryKey(String casenumber);

    int updateByPrimaryKeySelective(RecordInformation record);

    int updateByPrimaryKey(RecordInformation record);
}