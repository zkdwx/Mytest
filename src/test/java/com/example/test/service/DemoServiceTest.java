package com.example.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void demo() {
        String demo = demoService.demo();
        assertEquals(demo,"This is a demo !");

    }

    @Test
    public void index() {
        String hello = demoService.index("Hello");
        assertEquals(hello,"Hello");
    }

    @Test
    public void makeErr() {
        int i = demoService.makeErr(1, 0);
        assertEquals(i,2);
    }
}