package org.example.spring_start_here.ex9.port9090.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring_start_here.ex9.port9090.service.TestFeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TestFeignController {

    private final TestFeignService testFeignService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloTest() {
        return ResponseEntity.ok(testFeignService.getHelloWorld());
    }
}
