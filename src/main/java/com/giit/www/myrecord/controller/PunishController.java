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

//用户点击处罚库管理，跳转到处罚库查询，添加、修改自由裁量
@Controller
@RequestMapping("punish.do")
public class PunishController {

    @Resource(name = "deptBizImpl")
    private DeptBiz deptBiz;
    @RequiresRoles("admin")
    @RequestMapping("punish.view")
    //改成了punishView()
    public String punishView(Model m) {                 
        m.addAttribute("deptList", deptBiz.findAll());
        return "/admin/record/punishment";
    }

    @RequiresRoles("admin")
    @RequestMapping("punish_add.view")
    public String punishAddView(Model m) {
        return "/admin/record/punishment_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("punish_update.view")
    public String punishUpdateView(Model m) {
        return "/admin/record/punishment_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(String deptName) {
        deptBiz.add(deptName);
        return "redirect:/punish.do/punish.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Dept dept) {
        deptBiz.update(dept);
        return "redirect:/punish.do/punish.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(int deptId) {
        deptBiz.delete(deptId);
        return "redirect:/punish.do/punish.view";
    }


}
