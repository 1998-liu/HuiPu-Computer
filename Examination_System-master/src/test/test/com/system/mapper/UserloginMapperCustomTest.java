package com.system.mapper;


import com.system.po.UserLoginCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacey on 2017/6/28.
 */
public class UserLoginMapperCustomTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testFindOne() throws Exception {
        UserLoginMapperCustom UserLoginMapperCustom = (UserLoginMapperCustom) applicationContext.getBean("UserLoginMapperCustom");


    }

}