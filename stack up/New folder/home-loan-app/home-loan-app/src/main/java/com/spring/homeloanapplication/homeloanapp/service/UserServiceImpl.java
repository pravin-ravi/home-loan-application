package com.spring.homeloanapplication.homeloanapp.service;


import com.spring.homeloanapplication.homeloanapp.model.User;
import com.spring.homeloanapplication.homeloanapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;

    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = userRepo.findAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    public ResponseEntity<User> addUser(User user){
        userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    public ResponseEntity<User> loginUser(User user){
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

//    @Override
    public ResponseEntity<User> getUserById(long userId){
        User user = userRepo.findByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

//    @Override
    public ResponseEntity<User> updateUser(User user, long userId){
        userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
