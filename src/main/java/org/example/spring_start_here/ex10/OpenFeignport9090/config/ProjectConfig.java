package org.example.spring_start_here.ex10.OpenFeignport9090.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.example.spring_start_here.ex10.OpenFeignport9090.proxy")
public class ProjectConfig {
}
