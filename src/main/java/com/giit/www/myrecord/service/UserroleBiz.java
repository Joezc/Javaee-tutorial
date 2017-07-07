package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Userinfo;

/**
 * 用户角色的增改查.
 */
public interface UserroleBiz {

    public void createUserrole(Userinfo UserroleInfo);
    
    public void updateUserrole(Userinfo UserroleInfo);
    
    public void deleteUserrole(Userinfo UserroleInfo);
    
    public void findByDescription(String description);

    public List<Userinfo> findAll();

}
