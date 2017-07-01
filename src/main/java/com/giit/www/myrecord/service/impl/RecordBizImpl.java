package com.giit.www.myrecord.service.impl;

import com.giit.www.entity.BussinessInfo;
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
    public void createRecord(BussinessInfo bussinessInfo) {
        recordDao.createRecord(bussinessInfo);
    }

    @Override
    public void updateRecord(BussinessInfo bussinessInfo) {
        recordDao.updateRecord(bussinessInfo);
    }

    @Override
    public void findByDescription(String description) {
        recordDao.findByDescription(description);
    }

    @Override
    public List<BussinessInfo> findAll() {
        return recordDao.findAll();
    }
}
