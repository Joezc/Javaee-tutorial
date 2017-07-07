package com.giit.www.myrecord.service.impl;

import com.giit.www.entity.Recordinformation;
import com.giit.www.entity.Serviceinformation;
import com.giit.www.mapper.RecordinformationMapper;
import com.giit.www.mapper.ServiceinformationMapper;
import com.giit.www.myrecord.service.BussinessBiz;
import com.giit.www.myrecord.service.ServiceBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBizImpl implements ServiceBiz {
	@Autowired
    ServiceinformationMapper serviceinformationMapper;

    @Override
	public void createService(Serviceinformation serviceinformation) {
        serviceinformationMapper.insert(serviceinformation);
	}

	@Override
	public void updateService(Serviceinformation serviceinformation) {
        serviceinformationMapper.updateByPrimaryKey(serviceinformation);
	}

	@Override
	public void deleteService(String bunumber) {
        serviceinformationMapper.deleteByPrimaryKey(bunumber);
	}

	@Override
	public Serviceinformation findById(String bunumber) {
		return serviceinformationMapper.selectByPrimaryKey(bunumber);
	}

	@Override
	public List<Serviceinformation> findAll() {
		return serviceinformationMapper.findAll();
	}
}
