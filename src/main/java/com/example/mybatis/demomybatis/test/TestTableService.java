package com.example.mybatis.demomybatis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestTableService {

    @Autowired
    TestTableMapper testTableMapper;

    public Test selectTestById(Long id) {
        return testTableMapper.selectTestById(id);
    }

    public List<Test> selectAllTest() {
        return testTableMapper.selectAllTest();
    }

    public void insertTest(Test test) {
        testTableMapper.insertTest(test);
    }


}
