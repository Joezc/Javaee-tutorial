package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Userinfo;

/**
 * 用户管理的增改查
 */
public interface UsermanageBiz {

    public void createUsermanage(Userinfo UserInfo);
    
    public void updateUsermanage(Userinfo userinfo);
    
    public void deleteUsermanage(String userid);
    
    public Userinfo findById(String userid);

    public List<Userinfo> findAll();

}
