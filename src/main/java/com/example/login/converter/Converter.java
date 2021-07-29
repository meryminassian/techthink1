package com.example.login.converter;

import com.example.login.controller.model.UserResponse;
import com.example.login.persistence.User;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    public UserResponse fromUserToResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setFirst_name(user.getFirst_name());
        userResponse.setLast_name(user.getLast_name());
        userResponse.setUsername(user.getUsername());
        userResponse.setEmail(user.getEmail());
        return userResponse;

    }
}
