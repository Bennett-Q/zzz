package com.zq.error;


import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        System.out.println("--------ErrorConfig---------");
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/static/index.html");
        registry.addErrorPages(error404Page);
    }

}

