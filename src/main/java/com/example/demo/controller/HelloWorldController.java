package com.example.demo.controller;

import com.example.demo.service.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class HelloWorldController {
    @Autowired
    HelloWorldServiceImpl helloWorldService;

    @GetMapping(path = "/status")
    @ResponseBody
    public String hello() {
        return helloWorldService.hello();
    }
}
