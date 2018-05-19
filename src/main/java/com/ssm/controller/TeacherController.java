package com.ssm.controller;

import com.ssm.entity.TeacherEntity;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public TeacherEntity addTeacher(TeacherEntity teacherEntity){
        teacherService.add(teacherEntity);
        return  teacherEntity;
    }
}
