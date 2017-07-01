package com.giit.www.myrecord.dao;

import com.giit.www.entity.BussinessInfo;

import java.util.List;

/**
 * Created by lzc on 17-7-1.
 */
public interface RecordDao {

    public void createRecord(BussinessInfo bussinessInfo);

    public void updateRecord(BussinessInfo bussinessInfo);

    public void findByDescription(String description);

    public List<BussinessInfo> findAll();

}
