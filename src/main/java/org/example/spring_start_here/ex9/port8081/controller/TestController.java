package org.example.spring_start_here.ex9.port8081.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openapi")
public class TestController {

    @GetMapping("/hello")
    public String helloTest() {
        return "Hello World";
    }
}