package com.alhanoof.gateway.filter;

import org.springframework.stereotype.Component;

@Component
public class LoggingFilter {

    public void logRequest(
            String endpoint
    ) {

        System.out.println(
            "Request Received: " + endpoint
        );
    }
}
