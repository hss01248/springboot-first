package com.hss01248.ps.service;

import com.hss01248.ps.entity.User;
import com.hss01248.ps.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/13.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }


}
