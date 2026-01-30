package com.example.jobapp.service;

import org.springframework.stereotype.Service;

import com.example.jobapp.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public String signup(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                return "User already exists";
            }
        }
        users.add(user);
        return "Signup successful";
    }

    public String login(String email, String password) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                return "Login successful";
            }
        }
        return "Invalid Credentials";
    }
}
