package com.giit.www.myrecord.service.impl;

import java.util.List;

import com.giit.www.entity.ServiceinformationExample;
import com.giit.www.mapper.ServiceinformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giit.www.entity.Serviceinformation;
import com.giit.www.myrecord.service.BussinessBiz;

@Service
public class BussinessBizImpl implements BussinessBiz{

	@Autowired
	private ServiceinformationMapper serviceinformationMapper;

	@Override
	public void createBussiness(Serviceinformation BussinessInfo) {
		serviceinformationMapper.insert(BussinessInfo);
	}

	@Override
	public void updateBussiness(Serviceinformation BussinessInfo) {
		serviceinformationMapper.updateByPrimaryKey(BussinessInfo);
	}

	@Override
	public void deleteBussiness(Serviceinformation BussinessInfo) {
		serviceinformationMapper.deleteByPrimaryKey(BussinessInfo.getBunumber());
	}

	@Override
	public void findByDescription(String description) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Serviceinformation> findAll() {
		return  serviceinformationMapper.findAll();
	}

}
