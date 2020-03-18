package com.system.mapper;

import com.system.po.UserLogin;
import com.system.po.UserLoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginMapper {
    int countByExample(UserLoginExample example);

    int deleteByExample(UserLoginExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    List<UserLogin> selectByExample(UserLoginExample example);

    UserLogin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}