package org.example.spring_start_here.ex9.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.example.spring_start_here.ex9.proxy")
public class ProjectConfig {
}
