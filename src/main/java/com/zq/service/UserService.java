package com.zq.service;

import com.zq.base.HttpResult;
import com.zq.entity.User;

import java.util.List;

/**
 * Created by zhangq on 2019/6/3.
 */
public interface UserService {
    /*
    *
     * @Author 张琪
     * @Description //TODO 获取所有用户
     * @Date 2019/11/26 16:38
     * @Param []
     * @return java.util.List<com.zq.entity.User>
     **/
    public List<User> getUserList();

    /*
    *
     * @Author 张琪
     * @Description //TODO 新增
     * @Date 2019/11/26 16:38
     * @Param [user]
     * @return java.util.List<com.zq.entity.User>
     **/
    HttpResult<Boolean> insert(User user);
    /*
    *
     * @Author zhangqi
     * @Description //TODO 根据条件获取用户信息
     * @Date 2019/12/26 11:06 
     * @Param [user]
     * @return java.util.List<com.zq.entity.User>
     **/
    public List<User> getByCondition(User user);
}
