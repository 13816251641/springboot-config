package com.lujieni.springbootconfig.controller;

import com.lujieni.springbootconfig.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/get_student")
    public Student getStudent(){
        Student student = new Student();
        student.setDate(new Date());
        student.setName("12");
        student.setAge(21);
        return student;
    }

    @PostMapping("/save_student")
    public void saveStudent(@RequestBody Student student){
        log.info(student.toString());
    }

}
