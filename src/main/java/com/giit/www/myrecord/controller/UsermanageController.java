package com.giit.www.myrecord.controller;

import com.giit.www.college.service.StudentBiz;
import com.giit.www.entity.Student;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import java.io.IOException;

/**
 * Created by c0de8ug on 16-2-12.
 */
@Controller
@RequestMapping("usermanage.do")
public class UsermanageController {

    @Resource(name = "studentBizImpl")
    StudentBiz studentBiz;

    @RequiresRoles("admin")
    @RequestMapping("usermanage.view")
    
    //改为usermanageView
    public String usermanageView(Model m) {
        //TODO 将biz命名为和业务有关的函数方法,不知道是否正确留个吭
        m.addAttribute("studentList", studentBiz.studentView());
        return "/admin/record/usermanagement";
    }

    @RequiresRoles("admin")
    @RequestMapping("usersetrole.view")
    
    //改为usermanageView
    public String usersetroleView(Model m) {
        m.addAttribute("studentList", studentBiz.studentView());
        return "/admin/record/SetuserRole";
    }

    @RequiresRoles("admin")
    @RequestMapping("user_add.view")
    public String usemanageAddView(Model m) {

        return "/admin/record/userinfo_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("user_update.view")
    public String usermanageUpdateView(Model m) {

        return "/admin/record/userinfo_update";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Model m, MultipartFile pic, Student student) throws IOException {
        studentBiz.add(student, pic);
        return "redirect:/usermanage.do/usermanage.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(Model m, int studentId) {
        studentBiz.delete(studentId);
        return "redirect:/usermanage.do/usermanage.view";
    }

}
