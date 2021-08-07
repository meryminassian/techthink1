package com.example.login.facade;

import com.example.login.controller.model.RegisterRequest;
import com.example.login.controller.model.UserResponse;
import com.example.login.converter.Converter;
import com.example.login.persistence.User;
import com.example.login.service.DTO.UserDTO;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {
    @Autowired
    UserService userService;
    private final Converter converter;

    public UserFacade(Converter converter) {
        this.converter = converter;
    }


    public UserResponse register(RegisterRequest request){
        UserDTO userDTO = convertToDTO(request);
        User registeredUser = userService.register(userDTO);
        UserResponse userResponse = converter.fromUserToResponse(registeredUser);
        return userResponse;

    }


    private UserDTO convertToDTO(RegisterRequest request){
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(request.getFirstName());
        userDTO.setLastName(request.getLastName());
        userDTO.setUserName(request.getUserName());
        userDTO.setMail(request.getMail());
        userDTO.setPassword(new BCryptPasswordEncoder().encode(request.getPassword()));
        //userDTO.setRole(RoleName.USER);
        return userDTO;
    }
}
