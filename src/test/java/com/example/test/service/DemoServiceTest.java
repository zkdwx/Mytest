package com.example.test.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    void demo() {
        demoService.demo();
    }

    @Test
    void index() {
        demoService.index("Hello");
    }

    @Test
    void makeErr() {
        demoService.makeErr(1,0);
    }
}