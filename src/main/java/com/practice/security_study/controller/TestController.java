package com.practice.security_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testcontroller")
    String testGet()
    {
        return "you call the get controller";
    }
    @PostMapping("/testcontroller")
    String testPost()
    {
        return "you call the post controller";
    }
}
