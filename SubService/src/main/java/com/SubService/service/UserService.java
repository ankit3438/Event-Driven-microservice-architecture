package com.SubService.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SubService.entity.User;
import com.SubService.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @RabbitListener(queues = "UserServiceQueue")
    public void verifyUser(Long userId) {
        User user = userRepo.findById(userId).orElse(null);
        if (user != null) {
            user.setVerified(true); // or user.setIsVerified(true) based on your field name
            userRepo.save(user);
        }
    }
}
