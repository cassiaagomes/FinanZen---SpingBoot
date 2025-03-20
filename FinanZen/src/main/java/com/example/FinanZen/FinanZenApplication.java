package com.example.FinanZen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.FinanZen.model") 
public class FinanZenApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinanZenApplication.class, args);
    }
}
