package com.spring.homeloanapplication.homeloanapp.service;


import com.spring.homeloanapplication.homeloanapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public ResponseEntity<List<User>> getAllUsers();

    public ResponseEntity<User> addUser(User user);

    public ResponseEntity<User> loginUser(User user);

    public ResponseEntity<User> getUserById(long userId);

    public ResponseEntity<User> updateUser(User user, long userId);

}
