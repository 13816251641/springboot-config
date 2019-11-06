package com.lujieni.springbootconfig.controller;

import com.lujieni.springbootconfig.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/get_student")
    public Student getStudent(HttpServletRequest request){
        HttpSession session = request.getSession(true);//StandardSessionFacade
        String id = session.getId();// 633675F1DC88C51E222032FAE5B98D89
        session.setAttribute("age","28");
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
