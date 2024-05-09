package com.login.todo.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Adjust the mapping according to your API endpoints
                        .allowedOriginPatterns("*") // Allow requests from this origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH") // Allow these HTTP methods
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(false); // Allow sending cookies
            }
        };
    }
}

