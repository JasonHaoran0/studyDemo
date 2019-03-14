package com.tang.studydemo.school.service;


import com.tang.studydemo.school.mapper.StudentMapper;
import com.tang.studydemo.school.model.Student;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class StudentService {

    @Resource
    StudentMapper studentMapper;

    public List<Student> getAll() {
        List<Student> list = studentMapper.selectAll();
        return list;
    }
}
