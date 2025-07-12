package com.cognizant.jwt_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class JwtLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtLearnApplication.class, args);
    }
}
