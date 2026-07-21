package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    @Override
    public String coaching() {
        return "Swimming coach";
    }
}
