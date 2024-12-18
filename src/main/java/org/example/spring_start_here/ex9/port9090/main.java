package org.example.spring_start_here.ex9.port9090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }
}
