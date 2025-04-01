package com.diatoz.assignment.service;

import com.diatoz.assignment.entity.User;
import com.diatoz.assignment.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    AuthenticationManager authenticationManager;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }

    public String verify(User user){
        // Here we are authenticating the user with the Help of authenticationManager.authenticate() if the user exist or not.
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if(authentication.isAuthenticated()){
            return jwtUtil.generateToken(user);
        }
        return "UnAuthenticated User";
    }

    public void deleteUser(Long id){
        if(!userRepo.existsById(id)){
            throw new RuntimeException("User Don't Exist");
        }
        userRepo.deleteById(id);
    }
}
