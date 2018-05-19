package com.ssm.mapper;


import com.ssm.entity.TeacherEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    void insert(TeacherEntity teacherEntity);
}
