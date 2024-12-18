package org.example.spring_start_here.ex9.port9090.service;

import lombok.RequiredArgsConstructor;
import org.example.spring_start_here.ex9.port9090.client.TestFeignClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestFeignService {

    private final TestFeignClient testFeignClient;

    public String getHelloWorld(){
        return testFeignClient.getHelloWorld();
    }
}
