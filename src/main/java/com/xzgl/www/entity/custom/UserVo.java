package com.xzgl.www.entity.custom;

import com.xzgl.www.entity.User;

/**
 * Created by c0de8ug on 16-2-21.
 */
public class UserVo extends User {
    String roleIdsStr;

    @Override
    public String getRoleIdsStr() {
        return roleIdsStr;
    }

    @Override
    public void setRoleIdsStr(String roleIdsStr) {
        this.roleIdsStr = roleIdsStr;
    }
}
