package com.alhanoof.gateway.filter;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter {

    public boolean validateToken(
            String token
    ) {

        return token != null &&
               !token.isEmpty();
    }
}
