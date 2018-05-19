package com.ssm.service.impl;

import com.ssm.entity.StudentEntity;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentEntity add(StudentEntity studentEntity) {
        studentMapper.insert(studentEntity);
        return studentEntity;
    }
}
