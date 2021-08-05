package com.controller_spring_boot.controller_point_springboot.services;

import java.util.List;

import com.controller_spring_boot.controller_point_springboot.model.AccessLevel;
import com.controller_spring_boot.controller_point_springboot.repository.AccessLevelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessLevelServices {
    
    @Autowired
    private AccessLevelRepository accessLevelRepository;

    public AccessLevel saveAcessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public List<AccessLevel> findAll() {
        return accessLevelRepository.findAll();
    }

    //I didn't make all the HTTPS requests  CRUD

}
