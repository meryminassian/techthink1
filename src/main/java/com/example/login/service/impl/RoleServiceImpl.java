package com.example.login.service.impl;

import com.example.login.persistence.Role;
import com.example.login.persistence.repository.RoleRepository;
import com.example.login.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findRoleByName(String name){
        return roleRepository.findByName(name);
    }

    @Override
    public Role getRoleById(Long id){
        return roleRepository.getById(id);
    }
}
