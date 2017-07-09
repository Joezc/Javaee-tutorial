package com.giit.www.myrecord.controller;

import com.giit.www.entity.Punishment;
import com.giit.www.myrecord.service.PunishBiz;
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

//用户点击处罚库管理，跳转到处罚库查询，添加、修改自由裁量
@Controller
@RequestMapping("punish.do")
public class PunishController {

    @Resource(name = "punishBizImpl")
    private PunishBiz PunishBiz;
    @RequiresRoles("admin")
    @RequestMapping("punish.view")
    //改成了punishView()
    public String punishView(Model m) {                 
        m.addAttribute("punishList", PunishBiz.findAll());
        return "/admin/record/punishment";
    }

    @RequestMapping("punish_readonly.view")
    public String punishView_readonly(Model m) {
        m.addAttribute("punishList", PunishBiz.findAll());
        return "/individual/record/punishment";
    }

    @RequiresRoles("admin")
    @RequestMapping("punish_add.view")
    public String punishAddView(Model m) {
        return "/admin/record/punishment_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("punish_update.view")
    public String punishUpdateView(Model m, String itemid) {
        m.addAttribute("punish", PunishBiz.findById(itemid));
        return "/admin/record/punishment_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Punishment PunishType) {
        PunishBiz.createPunish(PunishType);
        return "redirect:/punish.do/punish.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("update")
    public String update(Punishment PunishType) {
    	PunishBiz.updatePunish(PunishType);
        return "redirect:/punish.do/punish.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(String itemid) {
        PunishBiz.delete(itemid);
        return "redirect:/punish.do/punish.view";
    }

    @RequestMapping("search")
    public String search(Model m, String itemid) {
        if (itemid.equals("")) {
            return "redirect:/punish.do/punish.view";
        }
        Punishment r = PunishBiz.findById(itemid);
        List<Punishment> ret = new ArrayList<>();
        ret.add(r);
        m.addAttribute("punishList", ret);
        return "/admin/record/punishment";
    }


}
