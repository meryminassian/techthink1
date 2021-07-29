package com.example.login;

import com.example.login.persistence.RoleName;
import com.example.login.persistence.User;
import com.example.login.service.RoleService;
import com.example.login.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogInApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogInApplication.class, args);
    }

}
