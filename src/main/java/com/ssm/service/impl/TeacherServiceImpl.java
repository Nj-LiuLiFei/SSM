package com.ssm.service.impl;

import com.ssm.entity.TeacherEntity;
import com.ssm.mapper.TeacherMapper;
import com.ssm.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl  implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    static final Logger LOG = LoggerFactory.getLogger(TeacherServiceImpl.class);

    @Transactional
    @Override
    public TeacherEntity add(TeacherEntity teacherEntity) {

        LOG.info("测试日志记录功能！");
        for(int i=0;i<2;i++) {
            if(i == 1) {
                //throw  new RuntimeException("测试事物回滚");
            }
            teacherMapper.insert(teacherEntity);
        }

        return teacherEntity;
    }
}
