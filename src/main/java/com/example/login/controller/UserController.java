package com.example.login.controller;

import com.example.login.controller.model.RegisterRequest;
import com.example.login.controller.model.UserResponse;
import com.example.login.facade.UserFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //log in
    //register

    private final UserFacade userFacade;

    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }


    @PostMapping(value = "/registerUser")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request){
        ResponseEntity<UserResponse> body = ResponseEntity.status(HttpStatus.CREATED).body(userFacade.register(request));
        return body;
    }


}
