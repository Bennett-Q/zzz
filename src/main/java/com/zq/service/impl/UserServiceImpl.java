package com.zq.service.impl;

import com.zq.entity.User;
import com.zq.mapper.UserMapper;
import com.zq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangq on 2019/6/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public List<User> getUserList() {
        return mapper.selectAll();
    }

}
