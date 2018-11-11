package com.example.mybatis.demomybatis.controller;

import com.example.mybatis.demomybatis.test.Test;
import com.example.mybatis.demomybatis.test.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//    curl -i -X POST http://localhost:8080/test -d '{"name":"kiddo", "address":"ADDR2"}' -H "Content-Type: application/json"

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestTableService testTableService;

    @PostMapping
    public String saveTestData(@RequestBody Test test) {
        System.out.println("Test Info " + test);
        testTableService.insertTest(test);

        return "OK";
    }

    @GetMapping("/{id}")
    public Test selectTestById(@PathVariable("id") Long id) {
        System.out.println("Select Test Data " + id);
        return testTableService.selectTestById(id);

    }

    @GetMapping
    public List<Test> selectAllTest() {
        return testTableService.selectAllTest();
    }
}

