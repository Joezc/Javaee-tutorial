package com.xzgl.www.system.service.impl;

import com.xzgl.www.entity.User;
import com.xzgl.www.system.dao.UserDao;
import com.xzgl.www.system.service.AccountBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by c0de8ug on 16-2-14.
 */
@Service
public class AccountBizImpl implements AccountBiz {

    @Resource
    UserDao userDao;

    @Override
    public User findByIdAndPassword(String username, String password) {
        return userDao.findByIdAndPassword(username, password);
    }


    @Override
    public void updatePassword(String id, String password) {
        userDao.updatePassword(id, password);
    }
}
