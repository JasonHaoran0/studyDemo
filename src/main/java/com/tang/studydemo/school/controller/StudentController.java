package com.tang.studydemo.school.controller;

import com.tang.studydemo.school.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/school")
public class StudentController {

    @Resource
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/getAllStudents")
    public void getAllStudents() {
        studentService.getAll();
    }

}
