package com.ssm.mapper;

import com.ssm.entity.StudentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    StudentEntity selectById(StudentEntity studentEntity);
    void insert(StudentEntity studentEntity);
}
