package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Punishment;

/**
 * 行政处罚的查询和增改
 */
public interface PunishBiz {

    public void createPunish(Punishment PubishInfo);
    
    public void updatePunish(Punishment PunishInfo);
    
    public List<Punishment> findAll();

    void delete(String itemid);

    Punishment findById(String itemid);
}
