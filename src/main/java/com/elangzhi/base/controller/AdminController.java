package com.elangzhi.base.controller;

import com.alibaba.fastjson.JSON;
import com.elangzhi.base.model.Admin;
import com.elangzhi.base.services.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaoXiang on 2015/11/30 0030.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public ModelAndView showCall(@PathVariable String name, HttpServletRequest request, ModelMap model){
        model.addAttribute("date", new Date());
        model.addAttribute("name", name);
        return new ModelAndView("index",model);
    }

    @RequestMapping("/{id}")
    public ModelAndView showCall(@PathVariable Long id,HttpServletRequest request,ModelMap model){
        Admin admin = adminService.findById(id);
        model.addAttribute("admin", admin);
        model.addAttribute("adminJson", JSON.toJSONString(admin));
        //onlygx
        model.addAttribute("date", new Date());
        return new ModelAndView("index",model);
    }

    @RequestMapping("/json/{id}")
    @ResponseBody
    public Map showCallJson(@PathVariable Long id, HttpServletRequest request){
        Admin admin = adminService.findById(id);
        Map<String,Object> model = new HashMap();
        model.put("admin", admin);
        model.put("date", new Date());
        return model;
    }




    // --------------------- Service -------------------
    @Resource
    private AdminService adminService;
}
