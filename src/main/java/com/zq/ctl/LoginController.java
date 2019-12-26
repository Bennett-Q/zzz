package com.zq.ctl;

import com.zq.base.HttpResult;
import com.zq.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangq on 2019/7/26.
 */
@Controller
@RequestMapping("/api")
public class LoginController {
    //实现跨域注解
//    @CrossOrigin(origins = "*",maxAge = 3600)
    //origin="*"代表所有域名都可访问
    //maxAge飞行前响应的缓存持续时间的最大年龄，简单来说就是Cookie的有效期 单位为秒
    //若maxAge是负数,则代表为临时Cookie,不会被持久化,Cookie信息保存在浏览器内存中,浏览器关闭Cookie就消失
    @CrossOrigin
    @ResponseBody
    @PostMapping("/login")
    @ApiOperation(value = "登录",tags = "登录")
    public HttpResult login(@RequestBody User user, HttpSession session){
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);
        if ("admin".equals(username) && "1111".equals(user.getPassword())) {
            session.setAttribute("user", user);
            return HttpResult.success("登录成功");
        }
        return HttpResult.error("登录失败");
    }
    @GetMapping("/index")
    @ApiOperation(value = "主页",tags = "主页")
    public String login(ModelMap model){
        return "/view/index";
    }
}
