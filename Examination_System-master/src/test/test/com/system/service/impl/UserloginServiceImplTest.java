package com.system.service.impl;

import com.system.po.UserLogin;
import com.system.service.TeacherService;
import com.system.service.UserLoginService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/30.
 */
public class UserLoginServiceImplTest {

    private ApplicationContext applicationContext;
    UserLoginService UserLoginService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
        UserLoginService = (UserLoginService) applicationContext.getBean("UserLoginServiceImpl");
    }

    @Test
    public void findByName() throws Exception {
        UserLogin u = UserLoginService.findByName("123");
        System.out.println();
    }

}