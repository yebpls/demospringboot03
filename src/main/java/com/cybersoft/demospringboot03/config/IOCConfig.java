package com.cybersoft.demospringboot03.config;

import com.cybersoft.demospringboot03.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCConfig {

    @Bean
    public Student createStudentIOC () {
        Student student = new Student();
        student.setName("CyberSoft");
        student.setAge(20);
        return student;
    }
}
