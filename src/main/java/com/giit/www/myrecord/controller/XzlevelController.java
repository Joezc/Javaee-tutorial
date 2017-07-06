package com.giit.www.myrecord.controller;

import com.giit.www.myrecord.service.XzlevelBiz;
import com.giit.www.entity.Userinfo;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by haining 
 */

//用户点击行政级别管理，跳转到 级别维护（概览）、级别查询（某个角色）界面
@Controller
@RequestMapping("xzlevel.do")
public class XzlevelController {

    @Resource(name = "xzlevelBizImpl")
    private XzlevelBiz XzlevelBiz;

    @RequiresRoles("admin")
    @RequestMapping("xzlevel.view")
    public String LeveltotalView(Model m) {
        m.addAttribute("XzlevelList", XzlevelBiz.findAll());
        return "/admin/record/level_totalinfo";
    }
    @RequiresRoles("admin")
    @RequestMapping("leveldetail.view")
    public String LeveldetailView(Model m) {
        m.addAttribute("XzlevelList", XzlevelBiz.findAll());
        return "/admin/record/level_detailinfo";
    }

    @RequiresRoles("admin")
    @RequestMapping("level_add.view")
    public String LevelAddView(Model m) {
        return "/admin/record/levelinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("level_update.view")
    public String LevelUpdateView(Model m) {
        return "/admin/record/levelinfo_update";
    }
    
    //把统计信息和行政写在了一起
    @RequiresRoles("admin")
    @RequestMapping("tongji.view")
    public String TongjiAddView(Model m) {
        return "/admin/record/tongji_info";
    }
    /*@RequiresRoles("admin")
    @RequestMapping("shencha.view")
    public String ShenchaAddView(Model m) {
        return "/admin/record/shencha_info";
    }
    @RequiresRoles("admin")
    @RequestMapping("songda.view")
    public String SongdaAddView(Model m) {
        return "/admin/record/songda_info";
    }
    @RequiresRoles("admin")
    @RequestMapping("zhixing.view")
    public String ZXAddView(Model m) {
        return "/admin/record/zhixing_info";
    }
    @RequiresRoles("admin")
    @RequestMapping("lian.view")
    public String LianAddView(Model m) {
        return "/admin/record/lian_info";
    }*/
    
    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Userinfo XzlevelInfo) {
    	XzlevelBiz.createXzlevel(XzlevelInfo);
        return "redirect:/xzlevel.do/level_totalinfo.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Userinfo XzlevelInfo) {
    	XzlevelBiz.updateXzlevel(XzlevelInfo);
        return "redirect:/xzlevel.do/level_totalinfo.view";
    }
    /*逻辑上的删除*/
    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(Userinfo XzlevelInfo) {
    	XzlevelBiz.updateXzlevel(XzlevelInfo);
        return "redirect:/xzlevel.do/level_totalinfo.view";
    }


}
