package com.example.login.service;

import com.example.login.persistence.User;
import com.example.login.service.DTO.UserDTO;


public interface UserService {

    User register(UserDTO request);
}
