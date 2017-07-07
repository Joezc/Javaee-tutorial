package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Recordinformation;
import com.giit.www.entity.Serviceinformation;

/**
 * Created by Yyk on 17-7-5.
 * 业务信息增改 查
 * 
 */
public interface BussinessBiz {

    public void createBussiness(Recordinformation recordinformation);
    
    public void updateBussiness(Recordinformation recordinformation);
    
    public void deleteBussiness(String casenumber);

    public Recordinformation findById(String casenumber);

    public List<Recordinformation> findAll();

}
