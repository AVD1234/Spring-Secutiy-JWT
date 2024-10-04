package com.security.security_JWT.controller;

import com.security.security_JWT.Entity.Student;
import com.security.security_JWT.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/allUsers")
    public List<Student> getAllUsers(){
        return studentService.allusers();
    }

    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return studentService.saveUser(student);
    }

}
