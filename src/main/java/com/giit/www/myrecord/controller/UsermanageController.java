package com.giit.www.myrecord.controller;

import com.giit.www.entity.Userinfo;
import com.giit.www.myrecord.service.UsermanageBiz;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import java.io.IOException;

/**
 * 用户管理
 */
@Controller
@RequestMapping("usermanage.do")
public class UsermanageController {

    @Resource(name = "userManageBizImpl")
    UsermanageBiz UsermanageBiz;

    @RequiresRoles("admin")
    @RequestMapping("usermanage.view")
    public String usermanageView(Model m) {
        m.addAttribute("UsermanageList", UsermanageBiz.findAll());
        return "/admin/record/usermanagement";
    }

    @RequiresRoles("admin")
    @RequestMapping("usersetrole.view")
    public String usersetroleView(Model m) {
    	m.addAttribute("UsermanageList", UsermanageBiz.findAll());
        return "/admin/record/SetuserRole";
    }

    @RequiresRoles("admin")
    @RequestMapping("user_add.view")
    public String usemanageAddView(Model m) {

        return "/admin/record/usermanagement_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("user_update.view")
    public String usermanageUpdateView(Model m, String userid) {
        m.addAttribute("user", UsermanageBiz.findById(userid));
        return "/admin/record/userinfo_update";
    }

 /*   @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Model m, MultipartFile pic, Usermanage student) throws IOException {
        UsermanageBiz.add(Usermanage, pic);
        return "redirect:/usermanage.do/usermanage.view";
    }*/
    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Userinfo Usermanageinfo) {
        UsermanageBiz.createUsermanage(Usermanageinfo);
        return "redirect:/usermanage.do/usermanage.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Userinfo userinfo) {
        UsermanageBiz.updateUsermanage(userinfo);
        return "redirect:/usermanage.do/usermanage.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(Model m, String userid) {
        UsermanageBiz.deleteUsermanage(userid);
        return "redirect:/usermanage.do/usermanage.view";
    }

}
