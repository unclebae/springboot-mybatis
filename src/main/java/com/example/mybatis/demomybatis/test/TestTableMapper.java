package com.example.mybatis.demomybatis.test;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestTableMapper {

    Test selectTestById(Long id);

    List<Test> selectAllTest();

    int insertTest(Test test);
}
