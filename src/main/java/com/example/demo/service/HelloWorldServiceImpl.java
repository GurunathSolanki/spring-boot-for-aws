package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl {
    public String hello() {
        return "Sample app is up and running !!";
    }
}
