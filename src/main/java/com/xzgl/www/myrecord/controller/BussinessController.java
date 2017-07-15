package com.xzgl.www.myrecord.controller;

import com.xzgl.www.entity.Recordinformation;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haining 
 */

//用户点击业务管理，跳转到业务管理，新增业务，修改、删除业务界面 
@Controller
@RequestMapping("buss.do")
public class BussinessController {

    @Resource(name="bussinessBizImpl")
    private com.xzgl.www.myrecord.service.BussinessBiz BussinessBiz;
    
    @RequiresRoles("admin")
    @RequestMapping("buss.view")
    public String bussView(Model m) {
        m.addAttribute("bussinessList", BussinessBiz.findAll());
        return "/admin/record/bussinessinfo";
    }


    @RequestMapping("buss_readonly.view")
    public String bussView_readonly(Model m) {
        m.addAttribute("bussinessList", BussinessBiz.findAll());
        return "/individual/record/bussinessinfo";
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

    @RequestMapping("search")
    public String search(Model m, String casenumber) {
        if (casenumber.equals("")) {
            return "redirect:/buss.do/buss.view";
        }
        Recordinformation r = BussinessBiz.findById(casenumber);
        List<Recordinformation> ret = new ArrayList<>();
        ret.add(r);
        m.addAttribute("bussinessList", ret);
        return "/admin/record/bussinessinfo";
    }

    @RequestMapping("search_individual")
    public String search_read(Model m, String casenumber) {
        if (casenumber.equals("")) {
            return "redirect:/buss.do/buss_readonly.view";
        }
        Recordinformation r = BussinessBiz.findById(casenumber);
        List<Recordinformation> ret = new ArrayList<>();
        ret.add(r);
        m.addAttribute("bussinessList", ret);
        return "/individual/record/bussinessinfo";
    }

}

