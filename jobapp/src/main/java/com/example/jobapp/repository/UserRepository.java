package com.example.jobapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobapp.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    // Custom finder method
    User findByEmail(String email);
}
