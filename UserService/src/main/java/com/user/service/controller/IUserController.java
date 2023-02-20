package com.user.service.controller;

import com.user.service.entities.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/user")
public interface IUserController {

    @PostMapping(path = "/create", produces = {"application/json" })
    public ResponseEntity<User> createUser(@RequestBody User user);

    @GetMapping(path = "/getUser/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId);

    @GetMapping(path = "/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers();

    @DeleteMapping(path = "/delete/{userId}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable String userId);

    @PostMapping(path = "/update", produces = {"application/json" })
    public ResponseEntity<User> updateUser(
            @RequestBody(required = true) User user,
            @RequestParam(required = true) String userId);
}
