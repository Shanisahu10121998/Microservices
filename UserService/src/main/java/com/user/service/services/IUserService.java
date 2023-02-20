package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface IUserService {

    // create a new user
    public User saveUser(User user);

    // get all the users
    public List<User> getAllUsers();

    // get a single user
    public User getUser(String userId);

    //remove a user by its id
    public void removeUser(String userId);

    public User updateUser(User user, String userId);

}
