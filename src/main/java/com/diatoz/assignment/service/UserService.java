package com.diatoz.assignment.service;

import com.diatoz.assignment.entity.User;
import com.diatoz.assignment.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }

    public void deleteUser(Long id){
        if(!userRepo.existsById(id)){
            throw new RuntimeException("User Don't Exist");
        }
        userRepo.deleteById(id);
    }
}
