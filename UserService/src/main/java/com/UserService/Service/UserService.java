package com.UserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserService.Entity.User;
import com.UserService.Repo.UserRepo;

@Service
public class UserService {

    // Logic for user service can be implemented here
    // For example, methods to create, update, delete users, etc.

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MessageProducer messageProducer;
    
    public String createUser(User user) {
        // Placeholder for user creation logic
        try {
            user.setISVerified(false); // efault value for iSVerified
            userRepo.save(user);
            messageProducer.sendMessage("User created with ID: " + user.getId());
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
        return "User created successfully";
    }
}
