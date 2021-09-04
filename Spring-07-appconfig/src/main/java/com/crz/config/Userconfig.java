package com.crz.config;

import com.crz.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.crz.pojo")
public class Userconfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
