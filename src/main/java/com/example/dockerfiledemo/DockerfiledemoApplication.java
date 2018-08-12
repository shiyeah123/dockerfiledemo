package com.example.dockerfiledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerfiledemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Dockerfile World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerfiledemoApplication.class, args);
    }
}