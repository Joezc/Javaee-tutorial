package com.xzgl.www.myrecord.controller;

import com.xzgl.www.entity.Userinfo;
import com.xzgl.www.myrecord.service.UserroleBiz;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by haining 
 */

//用户点击角色管理，跳转到 角色信息维护（概览）、角色信息查询（某个角色）界面
@Controller
@RequestMapping("rolemanage.do")
public class UserroleController {

    @Resource(name = "userroleBizImpl")
    private UserroleBiz UserroleBiz;
    @RequiresRoles("admin")
    @RequestMapping("roletotal.view")
    public String RoletotalView(Model m) {
        m.addAttribute("UserroleList", UserroleBiz.findAll());
        return "/admin/record/role_totalinfo";
    }
    @RequiresRoles("admin")
    @RequestMapping("roledetail.view")
    public String RoledetailView(Model m) {
        m.addAttribute("UserroleList", UserroleBiz.findAll());
        return "/admin/record/role_detailinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("role_add.view")
    public String RoleAddView(Model m) {
        return "/admin/record/roleinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("role_update.view")
    public String RoleUpdateView(Model m) {
        return "/admin/record/roleinfo_update";
    }
    //权限查看，没有增删改，和角色写到一起
    @RequiresRoles("admin")
    @RequestMapping("permission.view")
    public String PermissionView(Model m) {
        m.addAttribute("UserroleList", UserroleBiz.findAll());
        return "/admin/record/permission_info";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Userinfo UserroleInfo) {
    	UserroleBiz.createUserrole(UserroleInfo);
        return "redirect:/rolemanage.do/role_totalinfo.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Userinfo UserroleInfo) {
    	UserroleBiz.updateUserrole(UserroleInfo);
        return "redirect:/rolemanage.do/role_totalinfo.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(Userinfo UserroleInfo) {
        UserroleBiz.deleteUserrole(UserroleInfo);
        return "redirect:/rolemanage.do/role_totalinfo.view";
    }


}
