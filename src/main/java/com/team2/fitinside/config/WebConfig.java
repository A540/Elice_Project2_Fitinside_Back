package com.team2.fitinside.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000") // React 앱의 URL
                .allowedOrigins("https://fit-in-side.netlify.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
