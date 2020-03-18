package com.system.controller;

import com.system.po.UserLogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jacey on 2017/6/30.
 */
@Controller
public class LoginController {

    private UsernamePasswordToken token;

    //登录跳转
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String loginUI() throws Exception {
        return "../../login";
    }

    //登录表单处理
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(Model model, UserLogin UserLogin)  {

        //Shiro实现登录
        token = new UsernamePasswordToken(UserLogin.getUsername(),
                UserLogin.getPassword());

        try {
            Subject subject = SecurityUtils.getSubject();

            //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
            subject.login(token);

            if (subject.hasRole("admin")) {
                return "redirect:/admin/showCourse";
            } else if (subject.hasRole("teacher")) {
                return "redirect:/teacher/showCourse";
            } else if (subject.hasRole("student")) {
                return "redirect:/student/showCourse";
            }
        } catch (AuthenticationException e) {
            model.addAttribute("error",e.getMessage());
        }

        return "../../login";
    }

}
