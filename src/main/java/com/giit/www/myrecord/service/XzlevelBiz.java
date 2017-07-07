package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.Userinfo;

/**
 * 行政级别  增改查
 */
/**
 * 没有行政级别表，所以改为更新用户表里的LevelNo字段
 * @author 冯海宁
 *
 */
public interface XzlevelBiz {

    public void createXzlevel(Userinfo XzlevelInfo);
    
    public void updateXzlevel(Userinfo XzlevelInfo);
    
    public void deleteXzlevel(Userinfo XzlevelInfo);
    
    public void findByDescription(String description);

    public List<Userinfo> findAll();

}