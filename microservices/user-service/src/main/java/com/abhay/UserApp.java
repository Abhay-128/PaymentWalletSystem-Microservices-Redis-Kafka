package com.abhay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApp {

    @Bean
    public RequestFilter requestFilter(){
        return new RequestFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }
}