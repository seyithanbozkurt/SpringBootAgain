package com.example.SpringBootAgain.main;

import com.example.SpringBootAgain.config.AppConfig;
import com.example.SpringBootAgain.model.User;
import com.example.SpringBootAgain.service.LoginService;
import com.example.SpringBootAgain.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /*
        UserService userService = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("hakan"));
        userList.add(new User("mehmet"));


        userService.setUserList(userList);

        UserService userService1 = new UserService();
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();
    }




}
