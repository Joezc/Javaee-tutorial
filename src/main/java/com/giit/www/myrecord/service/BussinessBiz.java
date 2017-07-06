package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Serviceinformation;

/**
 * Created by Yyk on 17-7-5.
 * 业务信息增改 查
 * 
 */
public interface BussinessBiz {

    public void createBussiness(Serviceinformation BussinessInfo);
    
    public void updateBussiness(Serviceinformation BussinessInfo);
    
    public void deleteBussiness(Serviceinformation BussinessInfo);
    
    public void findByDescription(String description);

    public List<Serviceinformation> findAll();

}
