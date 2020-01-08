package com.zq.config;

import com.zq.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @desc 项目配置类
 * @author zhangq
 * @date 2019-07-25 13:54:15
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }

    //静态资源映射,将swagger中的页面映射到resources中，否则访问不到swagger
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { 

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

//        registry.addResourceHandler("/static/img/**")
//                .addResourceLocations("classpath:/resources/static/static/img/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    //拦截器
    /*
    *
     * @Author zhangqi
     * @Description //TODO 拦截器配置
     * @Date 2019/12/26 13:40
     * @Param [registry]
     * @return void
     **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("路过拦截器");
        registry.addInterceptor(getLoginInterceptor())
                //限制的访问链接
                .addPathPatterns("/**")
                //排除的访问链接
                .excludePathPatterns("/cat")
                //-----需要放行如下3条，不然拦截器会导致swagger不能访问
                .excludePathPatterns("/swagger-ui.html")
                .excludePathPatterns("/swagger-resources/**")
                .excludePathPatterns("/webjars/**")
                //-----为了测试放行的api，也可以写不需要权限的api
                .excludePathPatterns("/error")
                .excludePathPatterns("/login")
                .excludePathPatterns("/static/**")
                .excludePathPatterns("/index.html")

                .excludePathPatterns("/api/user/queryAll")
                .excludePathPatterns("/api/register")
                .excludePathPatterns("/api/login")
                .excludePathPatterns("/api/logout")
                .excludePathPatterns("/api/books");
    }
}