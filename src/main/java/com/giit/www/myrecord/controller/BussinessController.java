package com.giit.www.myrecord.controller;

import com.giit.www.college.service.DeptBiz;
import com.giit.www.entity.Dept;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by haining 
 */

//用户点击业务管理，跳转到业务管理，新增业务，修改业务界面
@Controller
@RequestMapping("buss.do")
public class BussinessController {

    @Resource(name = "deptBizImpl")
    private DeptBiz deptBiz;
    @RequiresRoles("admin")
    @RequestMapping("buss.view")
    public String bussView(Model m) {
        m.addAttribute("deptList", deptBiz.findAll());
        return "/admin/record/bussinessinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("buss_add.view")
    public String bussAddView(Model m) {
        return "/admin/record/bussinessinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("buss_update.view")
    public String bussUpdateView(Model m) {
        return "/admin/record/bussinessinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(String deptName) {
        deptBiz.add(deptName);
        return "redirect:/buss.do/bussinessinfo.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Dept dept) {
        deptBiz.update(dept);
        return "redirect:/buss.do/bussinessinfo.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(int deptId) {
        deptBiz.delete(deptId);
        return "redirect:/buss.do/bussinessinfo.view";
    }


}
