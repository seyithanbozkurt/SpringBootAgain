package com.example.SpringBootAgain.config;

import com.example.SpringBootAgain.model.User;
import com.example.SpringBootAgain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(){
        UserService userService = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("hakan"));
        userList.add(new User("mehmet"));

        userService.setUserList(userList);

        return userService;
    }
}
