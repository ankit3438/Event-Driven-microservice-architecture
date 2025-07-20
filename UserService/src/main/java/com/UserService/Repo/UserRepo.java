package com.UserService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserService.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    // Additional query methods can be defined here if needed

}
