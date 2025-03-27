package com.diatoz.assignment.controller;

import com.diatoz.assignment.entity.User;
import com.diatoz.assignment.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.register(user);
    }

    @DeleteMapping("/unregister/{id}")
    public void unRegister(@PathVariable Long id){
        service.deleteUser(id);
    }
}
