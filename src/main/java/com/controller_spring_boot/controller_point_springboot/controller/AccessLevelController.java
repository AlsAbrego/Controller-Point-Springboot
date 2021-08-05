package com.controller_spring_boot.controller_point_springboot.controller;

import java.util.List;

import com.controller_spring_boot.controller_point_springboot.model.AccessLevel;
import com.controller_spring_boot.controller_point_springboot.services.AccessLevelServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accesslevel")
public class AccessLevelController {

    @Autowired
    private AccessLevelServices accessLevelServices;

    @PostMapping
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel) {
        return accessLevelServices.saveAcessLevel(accessLevel);
    }

    @GetMapping
    public List<AccessLevel> getAccessLevels() {
        return accessLevelServices.findAll();        
    }
    
}
