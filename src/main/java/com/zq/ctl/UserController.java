package com.zq.ctl;

import com.zq.entity.User;
import com.zq.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhangq on 2019/6/3.
 */
@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/user/queryAll")
    @ApiOperation(value = "获取所有用户",tags = "用户")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
