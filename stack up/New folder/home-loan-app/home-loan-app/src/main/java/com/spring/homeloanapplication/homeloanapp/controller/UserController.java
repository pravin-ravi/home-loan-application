package com.spring.homeloanapplication.homeloanapp.controller;



import com.spring.homeloanapplication.homeloanapp.model.User;
import com.spring.homeloanapplication.homeloanapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/register")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user){
        return userService.loginUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable long userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable long userId){
        return userService.updateUser(user, userId);
    }
}
