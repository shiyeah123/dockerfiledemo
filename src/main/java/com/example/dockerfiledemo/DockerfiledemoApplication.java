package com.example.dockerfiledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.Optional;


@SpringBootApplication
@RestController
@EnableJpaRepositories
@EntityScan
public class DockerfiledemoApplication {

    
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/")
    public String home() {
        return "Hello springapp111-dockerfile World";
    }


    @RequestMapping("/testMysql/{id}")
    @ResponseBody
    public Optional<Student> test(@PathVariable(value="id") Integer id) {

        return studentRepository.findById(id);
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerfiledemoApplication.class, args);
    }
}
