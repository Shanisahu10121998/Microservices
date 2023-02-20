package com.user.service.services.impl;

import com.user.service.entities.User;
import com.user.service.services.IUserService;
import com.user.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUniqueID = UUID.randomUUID().toString();
        user.setUserId(randomUniqueID);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() ->
                new RuntimeException("User not found for given user id : " + userId));
    }

    @Override
    public void removeUser(String userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(User user, String userId) {
        User oldData = userRepository.findById(userId).orElseThrow(() ->
                new RuntimeException("User not found for given user id " + userId));
        oldData.setName(user.getName());
        oldData.setEmail(user.getEmail());
        oldData.setAbout(user.getAbout());
        return userRepository.save(oldData);
    }
}
