package com.example.login.service;

import com.example.login.persistence.User;


public interface UserService {

    User register(UserDTO request);
}
