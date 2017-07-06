package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Punishment;

/**
 * 行政处罚的查询和增改
 */
public interface PunishBiz {

    public void createPunish(Punishment PubishInfo);
    
    public void updatePunish(Punishment PunishInfo);
    
    public void deletePunish(Punishment PunishInfo);
    
    public void findByDescription(String description);

    public List<Punishment> findAll();

}
