package com.system.service.impl;

import com.system.mapper.UserLoginMapper;
import com.system.po.UserLogin;
import com.system.po.UserLoginExample;
import com.system.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper UserLoginMapper;


    public UserLogin findByName(String name) throws Exception {
        UserLoginExample UserLoginExample = new UserLoginExample();

        UserLoginExample.Criteria criteria = UserLoginExample.createCriteria();
        criteria.andUsernameEqualTo(name);

        List<UserLogin> list = UserLoginMapper.selectByExample(UserLoginExample);

        if(list.size() != 0)
            return list.get(0);
        return null;
    }

    public void save(UserLogin UserLogin) throws Exception {
        UserLoginMapper.insert(UserLogin);
    }

    public void removeByName(String name) throws Exception {
        UserLoginExample UserLoginExample = new UserLoginExample();

        UserLoginExample.Criteria criteria = UserLoginExample.createCriteria();
        criteria.andUsernameEqualTo(name);

        UserLoginMapper.deleteByExample(UserLoginExample);
    }

    @Override
    public boolean updateByName(String name, UserLogin UserLogin) {
        UserLoginExample UserLoginExample = new UserLoginExample();

        UserLoginExample.Criteria criteria = UserLoginExample.createCriteria();
        criteria.andUsernameEqualTo(name);

        if(UserLoginMapper.updateByExample(UserLogin, UserLoginExample) == 1){
            return true;
        }else
            return false;
    }

}
