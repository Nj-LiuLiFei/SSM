package com.ssm.service.impl;

import com.ssm.entity.TeacherEntity;
import com.ssm.mapper.TeacherMapper;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl  implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Transactional
    @Override
    public TeacherEntity add(TeacherEntity teacherEntity) {

        for(int i=0;i<2;i++) {
            if(i == 1) {
                //throw  new RuntimeException("测试事物回滚");
            }
            teacherMapper.insert(teacherEntity);
        }

        return teacherEntity;
    }
}
