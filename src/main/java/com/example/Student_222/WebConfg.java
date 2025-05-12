package com.example.Student_222;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfg implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // All APIs
        .allowedOrigins("http://127.0.0.1:5500")  // Frontend URL (where your HTML file is hosted)
        .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed methods
        .allowedHeaders("*");  // Allow any headers
    }
}
