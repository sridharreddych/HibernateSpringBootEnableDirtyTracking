package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    @Autowired
    BookstoreService userService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            userService.saveAndUpdateUser();
        };
    }
}
/*
*How To Enable Dirty Tracking In A Spring Boot Application

Description: Prior to Hibernate version 5, the dirty checking mechanism relies on Java Reflection API. Starting with Hibernate version 5, the dirty checking mechanism can rely on bytecode enhancement. This approach sustain a better performance, especially when you have a relatively large number of entitites. Enabling bytecode enhancement is about adding a plugin into the application.

Key points:

Hibernate come with plugins for Maven and Gradle
for Maven, add the plugin in the pom.xml file
Output example:


The bytecode enhancement effect can be seen on Author.class here


*/