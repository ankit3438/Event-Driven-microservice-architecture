package com.SubService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SubService.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}

