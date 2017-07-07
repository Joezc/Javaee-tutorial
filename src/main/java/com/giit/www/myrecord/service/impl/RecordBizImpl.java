package com.giit.www.myrecord.service.impl;

import com.giit.www.entity.Recordinformation;
import com.giit.www.myrecord.dao.RecordDao;
import com.giit.www.myrecord.service.RecordBiz;
import com.giit.www.system.dao.RoleDao;
import com.giit.www.system.service.ResourceBiz;
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
