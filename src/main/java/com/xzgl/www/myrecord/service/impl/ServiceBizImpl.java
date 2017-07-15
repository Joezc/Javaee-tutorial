package com.xzgl.www.myrecord.service.impl;

import com.xzgl.www.entity.Recordinformation;
import com.xzgl.www.entity.Serviceinformation;
import com.xzgl.www.entity.ServiceinformationExample;
import com.xzgl.www.mapper.RecordinformationMapper;
import com.xzgl.www.mapper.ServiceinformationMapper;
import com.xzgl.www.myrecord.service.ServiceBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBizImpl implements ServiceBiz {
	@Autowired
    ServiceinformationMapper serviceinformationMapper;

	@Autowired
    RecordinformationMapper recordinformationMapper;

    /**
     * 如果该业务完成了案件，更新案件的是否完成字段。
     * @param serviceinformation service
     */
	private void helpCheck(Serviceinformation serviceinformation) {
        if (serviceinformation.getCasewhether().equals("Yes")) {
            Recordinformation tmp = recordinformationMapper.
                    selectByPrimaryKey(serviceinformation.getCasenumber());
            tmp.setCurrentstauis("Yes");
            recordinformationMapper.updateByPrimaryKey(tmp);
        }
    }

    @Override
	public void createService(Serviceinformation serviceinformation) {
        serviceinformationMapper.insert(serviceinformation);
        helpCheck(serviceinformation);
	}

	@Override
	public void updateService(Serviceinformation serviceinformation) {
        serviceinformationMapper.updateByPrimaryKey(serviceinformation);
        helpCheck(serviceinformation);
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

	@Override
	public List<Serviceinformation> findByType(String type) {
		ServiceinformationExample example = new ServiceinformationExample();
		example.createCriteria().andTypeEqualTo(type);
		return serviceinformationMapper.selectByExample(example);
	}
}
