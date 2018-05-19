package com.ssm.controller;


import com.ssm.entity.StudentEntity;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public StudentEntity addStudent(StudentEntity studentEntity){
        if(studentEntity.getName().equals("")) {

        }
        studentService.add(studentEntity);
        return studentEntity;
    }
    @RequestMapping(value = "/getStudentById.do",method = RequestMethod.GET)
    public StudentEntity getStudentById(){
        return  new StudentEntity();
    }
    @RequestMapping(value = "/updateStudentById.do",method = RequestMethod.POST)
    public StudentEntity updateStudentById(){
        return  new StudentEntity();
    }
}
