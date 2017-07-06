package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Userinfo;

/**
 * 用户管理的增改查
 */
public interface UsermanageBiz {

    public void createUsermanage(Userinfo UserInfo);
    
    public void updateUsermanage(Userinfo UserInfo);
    
    public void deleteUsermanage(Userinfo UserInfo);
    
    public void findByDescription(String description);

    public List<Userinfo> findAll();

}
