package com.system.controller;

import com.system.exception.CustomException;
import com.system.po.UserLogin;
import com.system.service.UserLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Jacey on 2017/7/6.
 */
@Controller
class RsetPasswordController {

    @Resource(name = "userLoginServiceImpl")
    private UserLoginService userLoginService;

    // 本账户密码重置
    @RequestMapping(value = "/passwordRset", method = {RequestMethod.POST})
    public String passwordRset(String oldPassword, String password1) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        UserLogin userLogin = userLoginService.findByName(username);

        if (!oldPassword.equals(userLogin.getPassword())) {
            throw new CustomException("旧密码不正确");
        } else {
            userLogin.setPassword(password1);
            userLoginService.updateByName(username, userLogin);
        }

        return "redirect:/logout";
    }

}
