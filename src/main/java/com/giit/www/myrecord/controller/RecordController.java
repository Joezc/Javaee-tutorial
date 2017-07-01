package com.giit.www.myrecord.controller;

import com.giit.www.entity.BussinessInfo;
import com.giit.www.entity.Role;
import com.giit.www.myrecord.service.RecordBiz;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

/**
 * Created by lzc on 17-7-1.
 */
@Controller
@RequestMapping("/record.do")
public class RecordController {
    @Resource(name="recordBizImpl")
    private RecordBiz recordBiz;

    @RequiresRoles("admin")
    @RequestMapping("record.view")
    public String recordView(Model model) {
        model.addAttribute("recordList", recordBiz.findAll());
        return "admin/system/record/record";
    }

    @RequiresRoles("admin")
    @RequestMapping("record_add.view")
    public String recordAddView(Model model) {
        model.addAttribute("recordList", recordBiz.findAll());
        return "/admin/system/record/record_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(BussinessInfo record, RedirectAttributes redirectAttributes) {
        recordBiz.createRecord(record);
        return "redirect:/record.do/record.view";
    }

}
