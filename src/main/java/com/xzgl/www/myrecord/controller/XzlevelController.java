package com.xzgl.www.myrecord.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by haining 
 */

//用户点击行政级别管理，跳转到 级别维护（概览）、级别查询（某个角色）界面
@Controller
@RequestMapping("xzlevel.do")
public class XzlevelController {

    @Resource(name = "xzlevelBizImpl")
    private com.xzgl.www.myrecord.service.XzlevelBiz XzlevelBiz;

//    @RequiresRoles("admin")
//    @RequestMapping("xzlevel.view")
//    public String LeveltotalView(Model m) {
//        m.addAttribute("XzlevelList", XzlevelBiz.findAll());
//        return "/admin/record/level_totalinfo";
//    }
//    @RequiresRoles("admin")
//    @RequestMapping("leveldetail.view")
//    public String LeveldetailView(Model m) {
//        m.addAttribute("XzlevelList", XzlevelBiz.findAll());
//        return "/admin/record/level_detailinfo";
//    }
//
//    @RequiresRoles("admin")
//    @RequestMapping("level_add.view")
//    public String LevelAddView(Model m) {
//        return "/admin/record/levelinfo_add";
//    }
//
//    @RequiresRoles("admin")
//    @RequestMapping("level_update.view")
//    public String LevelUpdateView(Model m) {
//        return "/admin/record/levelinfo_update";
//    }
//
    //把统计信息和行政写在了一起
    @RequiresRoles("admin")
    @RequestMapping("tongji.view")
    public String TongjiAddView(Model m) {
        return "/admin/record/tongji_info";
    }

    @RequiresRoles("admin")
    @RequestMapping("search")
    public String search(Model m, Date starttime, Date endtime, String dpname) {
        m.addAttribute("starttime", starttime.toString());
        m.addAttribute("endtime", endtime.toString());
        m.addAttribute("dpname", dpname);
        List<Integer> num = XzlevelBiz.searchByTime(starttime, endtime);
        m.addAttribute("numOfFiniashedRecord", Integer.toString(num.get(0)));
        m.addAttribute("numOfAllRecord", Integer.toString(num.get(1)));
        m.addAttribute("ratio", Double.toString(1.0* num.get(0) / num.get(1)));

        return "/admin/record/tongji_info";
    }

    @RequiresRoles("admin")
    @RequestMapping("tongjiService.view")
    public String statisticService(Model m, String type) {
        m.addAttribute("type", type);
        return "/admin/record/statistic_service";
    }

    @RequiresRoles("admin")
    @RequestMapping("searchService")
    public String searchService(Model m, Date starttime, Date endtime, String dpname, String type) {
        m.addAttribute("starttime", starttime.toString());
        m.addAttribute("endtime", endtime.toString());
        m.addAttribute("dpname", dpname);
        List<Integer> num = XzlevelBiz.searchServiceByTime(starttime, endtime, type);
        m.addAttribute("numOfFiniashedRecord", Integer.toString(num.get(0)));
        m.addAttribute("numOfAllRecord", Integer.toString(num.get(1)));
        m.addAttribute("ratio", Double.toString(1.0* num.get(0) / num.get(1)));
        m.addAttribute("type", type);

        return "/admin/record/statistic_service";
    }

//    @RequiresRoles("admin")
//    @RequestMapping("add")
//    public String add(Userinfo XzlevelInfo) {
//    	XzlevelBiz.createXzlevel(XzlevelInfo);
//        return "redirect:/xzlevel.do/level_totalinfo.view";
//    }
//
//    @RequiresRoles("admin")
//    @RequestMapping("update")
//    public String update(Userinfo XzlevelInfo) {
//    	XzlevelBiz.updateXzlevel(XzlevelInfo);
//        return "redirect:/xzlevel.do/level_totalinfo.view";
//    }
//    /*逻辑上的删除*/
//    @RequiresRoles("admin")
//    @RequestMapping("delete")
//    public String delete(Userinfo XzlevelInfo) {
//    	XzlevelBiz.updateXzlevel(XzlevelInfo);
//        return "redirect:/xzlevel.do/level_totalinfo.view";
//    }
//

}
