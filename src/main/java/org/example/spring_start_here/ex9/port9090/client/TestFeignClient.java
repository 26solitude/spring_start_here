package org.example.spring_start_here.ex9.port9090.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "testFeignClient", url = "${name.service.url}")
public interface TestFeignClient {
    @GetMapping("/openapi/hello")
    String getHelloWorld();
}
