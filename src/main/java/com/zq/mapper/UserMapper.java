package com.zq.mapper;

import com.zq.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    public List<User> getUserList();
    public List<User> getByCondition(User user);
}