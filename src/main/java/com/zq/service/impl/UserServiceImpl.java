package com.zq.service.impl;

import com.zq.base.HttpResult;
import com.zq.entity.User;
import com.zq.mapper.UserMapper;
import com.zq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by zhangq on 2019/6/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;
    /*
    *
     * @Author 张琪
     * @Description //TODO 获取所有用户
     * @Date 2019/11/26 16:38
     * @Param []
     * @return java.util.List<com.zq.entity.User>
     **/
    @Override
    public List<User> getUserList() {
        return mapper.selectAll();
    }
    /*
    *
     * @Author 张琪
     * @Description //TODO 新增
     * @Date 2019/11/26 16:38
     * @Param [user]
     * @return java.util.List<com.zq.entity.User>
     **/
    @Override
    public HttpResult<Boolean> insert(User user) {
        try {
            mapper.insert(user);
            return HttpResult.success(true);
        }catch (Exception e){
            e.printStackTrace();
            return HttpResult.error(e.getMessage());
        }

    }
    /*
    *
     * @Author zhangqi
     * @Description //TODO 根据条件获取用户信息
     * @Date 2019/12/26 11:06
     * @Param [user]
     * @return java.util.List<com.zq.entity.User>
     **/
    @Override
    public List<User> getByCondition(User user) {
        return mapper.getByCondition(user);
    }

}
