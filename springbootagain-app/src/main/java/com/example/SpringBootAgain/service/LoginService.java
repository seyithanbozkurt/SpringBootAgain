package com.example.SpringBootAgain.service;


import com.example.SpringBootAgain.config.AppConfig;
import org.apache.tomcat.util.descriptor.web.LoginConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {
    public void login(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);



    }
}
