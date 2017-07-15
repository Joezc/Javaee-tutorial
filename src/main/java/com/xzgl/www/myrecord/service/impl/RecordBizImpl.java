package com.xzgl.www.myrecord.service.impl;

import com.xzgl.www.entity.Recordinformation;
import com.xzgl.www.myrecord.dao.RecordDao;
import com.xzgl.www.myrecord.service.RecordBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lzc on 17-7-1.
 */
@Service
public class RecordBizImpl implements RecordBiz {
    @Resource
    private RecordDao recordDao;
    @Resource(name = "recordBizImpl")
    private RecordBiz recordBiz;

    @Override
    public void createRecord(Recordinformation recordInfo) {
        recordDao.createRecord(recordInfo);
    }

    @Override
    public void updateRecord(Recordinformation recordInfo) {
        recordDao.updateRecord(recordInfo);
    }

    @Override
    public void findByDescription(String description) {
        recordDao.findByDescription(description);
    }

    @Override
    public List<Recordinformation> findAll() {
        return recordDao.findAll();
    }
}
