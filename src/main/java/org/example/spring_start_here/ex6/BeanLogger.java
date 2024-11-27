package org.example.spring_start_here.ex6;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanLogger implements BeanPostProcessor {
    private int counter = 0;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println(++counter + ": " + beanName);
        return bean;
    }
}
