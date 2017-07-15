package com.xzgl.www.myrecord.service.impl;

import com.xzgl.www.entity.Userinfo;
import com.xzgl.www.mapper.UserinfoMapper;
import com.xzgl.www.myrecord.service.UsermanageBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lzc on 17-7-6.
 */
@Service
public class UserManageBizImpl implements UsermanageBiz {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public void createUsermanage(Userinfo UserInfo) {
        userinfoMapper.insert(UserInfo);
    }

    @Override
    public void updateUsermanage(Userinfo userinfo) {
        userinfoMapper.updateByPrimaryKey(userinfo);
    }

    @Override
    public void deleteUsermanage(String userid) {
        userinfoMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public Userinfo findById(String userid) {
        return userinfoMapper.selectByPrimaryKey(userid);
    }

    @Override
    public List<Userinfo> findAll() {
        return userinfoMapper.findAll();
    }
}
