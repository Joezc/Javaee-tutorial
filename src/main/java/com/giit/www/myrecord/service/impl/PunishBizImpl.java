package com.giit.www.myrecord.service.impl;

import com.giit.www.entity.Punishment;
import com.giit.www.mapper.PunishmentMapper;
import com.giit.www.myrecord.service.PunishBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lzc on 17-7-6.
 */
@Service
public class PunishBizImpl implements PunishBiz {
    @Autowired
    PunishmentMapper punishmentMapper;

    @Override
    public void createPunish(Punishment PubishInfo) {
        punishmentMapper.insert(PubishInfo);
    }

    @Override
    public void updatePunish(Punishment PunishInfo) {
        punishmentMapper.updateByPrimaryKey(PunishInfo);
    }

    @Override
    public List<Punishment> findAll() {
        return punishmentMapper.findAll();
    }

    @Override
    public void delete(String itemid) {
        punishmentMapper.deleteByPrimaryKey(itemid);
    }

    @Override
    public  Punishment findById(String itemid) {
        return punishmentMapper.selectByPrimaryKey(itemid);
    }
}
