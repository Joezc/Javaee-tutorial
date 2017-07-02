package com.giit.www.system.service.impl;

import com.giit.www.entity.User;
import com.giit.www.system.service.UserBiz;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzc on 17-7-2.
 */
public class UserBizImplTest {
    @Test
    public void findById() throws Exception {
        User user = new User();
        user.setUserId("admin");
        user.setPassword("3ab82b226b3b60f4eab8cd0a88887ba0");
        user.setSalt("cd0faf6f821809044e35e35fd23cf44a");
        user.setRoleIdsStr("1");
        user.setLocked(false);

        UserBizImpl userBiz = new UserBizImpl();
        assertEquals(user, userBiz.findById(user.getUserId()));
    }

}