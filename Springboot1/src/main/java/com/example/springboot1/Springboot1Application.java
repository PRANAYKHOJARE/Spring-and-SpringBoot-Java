package com.example.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1Application {

    @Autowired
    Alien alien;   // Dependency Injection

    public static void main(String[] args) {
        var context = SpringApplication.run(Springboot1Application.class, args);

        Springboot1Application app = context.getBean(Springboot1Application.class);
        app.alien.code();
    }
}