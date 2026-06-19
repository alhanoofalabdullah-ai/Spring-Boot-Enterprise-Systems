package com.alhanoof.security.security;

public class JwtService {

    public String generateToken(String username) {

        return "jwt-token-for-" + username;
    }
}
