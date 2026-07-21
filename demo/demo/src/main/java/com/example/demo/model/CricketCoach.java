package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach{
    @Override
    public String coaching() {
        return "Cricket Coach";
    }
}
