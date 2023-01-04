package com.example.configuration;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class KeycloakConfiguration {
    @Bean
    public KeycloakConfigResolver keycloakConfigResolver() {
        return new PathBasedKeycloakConfigResolver();
    }
}

