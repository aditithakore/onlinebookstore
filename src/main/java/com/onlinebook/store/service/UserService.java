package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Users;
import com.onlinebook.store.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    // Add other methods as needed

}
