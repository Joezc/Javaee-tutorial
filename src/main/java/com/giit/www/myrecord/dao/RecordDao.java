package com.giit.www.myrecord.dao;

import java.util.List;

import com.giit.www.entity.RecordInformation;
import com.giit.www.entity.Serviceinformation;

/**
 * Created by lzc on 17-7-1.
 */
public interface RecordDao {

    public void createRecord(RecordInformation recordInfo);

    public void updateRecord(RecordInformation recordInfo);

    public void findByDescription(String description);

    public List<RecordInformation> findAll();

}
