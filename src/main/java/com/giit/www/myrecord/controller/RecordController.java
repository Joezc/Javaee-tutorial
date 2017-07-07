package com.giit.www.myrecord.controller;

import com.giit.www.entity.Recordinformation;
import com.giit.www.entity.Serviceinformation;
import com.giit.www.myrecord.service.RecordBiz;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

/**
 * Created by haining 
 */

//用户点击立案信息管理，跳转到立案信息管理界面
@Controller
@RequestMapping("record.do")
/*        /record.do     */
public class RecordController {

    @Resource(name = "recordBizImpl")
    private RecordBiz recordBiz;

    @RequiresRoles("admin")
    @RequestMapping("record.view")
    public String recordView(Model m) {
        m.addAttribute("recordList", recordBiz.findAll());
        return "/admin/record/recordinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("record_add.view")
    public String recordAddView(Model m) {

        return "/admin/record/recordinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("record_update.view")
    public String recordUpdateView(Model m) {
        return "/admin/record/recordinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Recordinformation record) {
        recordBiz.createRecord(record);
        return "redirect:/record.do/record.view";
    }
    //update方法有待研究
    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Recordinformation record) {
        recordBiz.updateRecord(record);
        return "redirect:/record.do/record.view";
    }


}
