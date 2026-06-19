package com.alhanoof.security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public String register() {
        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public String login() {
        return "JWT Token Generated";
    }
}
