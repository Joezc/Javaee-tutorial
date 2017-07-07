package com.giit.www.myrecord.controller;

import com.giit.www.entity.BussinessInfo;
import com.giit.www.entity.Recordinformation;
import com.giit.www.myrecord.service.BussinessBiz;
import com.giit.www.entity.Serviceinformation;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by haining 
 */

//用户点击业务管理，跳转到业务管理，新增业务，修改、删除业务界面 
@Controller
@RequestMapping("buss.do")
public class BussinessController {

    @Resource(name="bussinessBizImpl")
    private BussinessBiz BussinessBiz;
    
    @RequiresRoles("admin")
    @RequestMapping("buss.view")
    public String bussView(Model m) {
        m.addAttribute("bussinessList", BussinessBiz.findAll());
        return "/admin/record/bussinessinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("buss_add.view")
    public String bussAddView(Model m) {
        return "/admin/record/bussinessinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("buss_update.view")
    public String bussUpdateView(Model m, String casenumber) {
        m.addAttribute("bussiness", BussinessBiz.findById(casenumber));
        return "/admin/record/bussinessinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Recordinformation recordinformation) {
        BussinessBiz.createBussiness(recordinformation);
        return "redirect:/buss.do/buss.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Recordinformation recordinformation) {
    	BussinessBiz.updateBussiness(recordinformation);
        return "redirect:/buss.do/buss.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(String casenumber) {
    	BussinessBiz.deleteBussiness(casenumber);
        return "redirect:/buss.do/buss.view";
    }


}

