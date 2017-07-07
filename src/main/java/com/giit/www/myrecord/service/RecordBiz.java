package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Recordinformation;

/**
 * Created by lzc on 17-7-1.
 */
public interface RecordBiz {

    public void createRecord(Recordinformation recordInfo);
    
    public void updateRecord(Recordinformation recordInfo);
    
    public void findByDescription(String description);

    public List<Recordinformation> findAll();

}
