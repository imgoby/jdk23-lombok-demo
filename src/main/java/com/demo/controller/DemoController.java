package com.demo.controller;

import com.demo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class DemoController {
    @GetMapping("/get")
    public Student student() {
        Student student = new Student();
        return student;
    }
}
