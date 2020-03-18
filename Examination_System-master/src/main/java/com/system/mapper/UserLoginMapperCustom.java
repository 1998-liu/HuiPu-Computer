package com.system.mapper;

import com.system.po.UserLoginCustom;

/**
 *  UserLoginMapper扩展类
 */
public interface UserLoginMapperCustom {

    UserLoginCustom findOneByName(String name) throws Exception;

}
