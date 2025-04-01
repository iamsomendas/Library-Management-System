package com.diatoz.assignment.controller;

import com.diatoz.assignment.entity.User;
import com.diatoz.assignment.service.JwtUtil;
import com.diatoz.assignment.service.MyUserDetailsService;
import com.diatoz.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return service.verify(user);
    }

    @DeleteMapping("/unregister/{id}")
    public void unRegister(@PathVariable Long id){
        service.deleteUser(id);
    }
}
