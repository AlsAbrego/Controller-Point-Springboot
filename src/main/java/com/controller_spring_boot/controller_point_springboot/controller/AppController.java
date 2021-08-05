package com.controller_spring_boot.controller_point_springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.*;


@RestController
public class AppController {
    
    @Value("${app.message}")
    private String appMessage;

    @ApiOperation(value = "Welcome page", response = Iterable.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved the Welcome Page"),
        @ApiResponse(code = 401, message = "You are not authorized to view this Page"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/")    
    public String getAppMessage() {
        return appMessage;        
    }
}
