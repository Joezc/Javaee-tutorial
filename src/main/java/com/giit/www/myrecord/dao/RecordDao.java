package com.giit.www.myrecord.dao;

import java.util.List;

import com.giit.www.entity.Recordinformation;

/**
 * Created by lzc on 17-7-1.
 */
public interface RecordDao {

    public void createRecord(Recordinformation recordInfo);

    public void updateRecord(Recordinformation recordInfo);

    public void findByDescription(String description);

    public List<Recordinformation> findAll();

}
