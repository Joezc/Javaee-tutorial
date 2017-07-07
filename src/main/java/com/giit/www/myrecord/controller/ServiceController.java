package com.giit.www.myrecord.controller;

import com.giit.www.myrecord.service.ServiceBiz;
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
@RequestMapping("service.do")
public class ServiceController {

    @Resource(name="serviceBizImpl")
    private ServiceBiz ServiceBiz;

    @RequiresRoles("admin")
    @RequestMapping("service.view")
    public String serviceView(Model m) {
        m.addAttribute("serviceList", ServiceBiz.findAll());
        return "/admin/record/serviceinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("service_add.view")
    public String serviceAddView(Model m) {
        return "/admin/record/serviceinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("service_update.view")
    public String serviceUpdateView(Model m, String bunumber) {
        m.addAttribute("service", ServiceBiz.findById(bunumber));
        return "/admin/record/serviceinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Serviceinformation serviceinformation) {
        ServiceBiz.createService(serviceinformation);
        return "redirect:/service.do/service.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Serviceinformation serviceinformation) {
        ServiceBiz.updateService(serviceinformation);
        return "redirect:/service.do/service.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(String bunumber) {
        ServiceBiz.deleteService(bunumber);
        return "redirect:/service.do/service.view";
    }


}

