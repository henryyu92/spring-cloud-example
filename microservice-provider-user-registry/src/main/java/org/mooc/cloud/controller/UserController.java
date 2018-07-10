package org.mooc.cloud.controller;

import org.mooc.cloud.entity.User;
import org.mooc.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @GetMapping("/user/instances")
    public Object instances(){
        List<String> services = discoveryClient.getServices();
        return services;
    }
}