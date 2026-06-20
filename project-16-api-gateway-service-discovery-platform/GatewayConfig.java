package com.alhanoof.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public String gatewayConfiguration() {

        return "Gateway Config Loaded";
    }
}
