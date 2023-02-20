package com.user.service.controller.impl;

import com.user.service.controller.IUserController;
import com.user.service.entities.User;
import com.user.service.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @Override
    public ResponseEntity<User> createUser(User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @Override
    public ResponseEntity<User> getUser(String userId) {

        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<Boolean> deleteUser(String userId) {
        userService.removeUser(userId);
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity<User> updateUser(User user, String userId) {
        return ResponseEntity.ok(userService.updateUser(user, userId));
    }
}
