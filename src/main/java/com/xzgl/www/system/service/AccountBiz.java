package com.xzgl.www.system.service;

import com.xzgl.www.entity.User;

/**
 * Created by c0de8ug on 16-2-14.
 */
public interface AccountBiz {

    public User findByIdAndPassword(String username, String password);

    public void updatePassword(String id, String password);
}
