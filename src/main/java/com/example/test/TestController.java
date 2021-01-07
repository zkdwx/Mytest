package com.example.test;

import com.example.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/say")
    public String say() {
        return "I LOVE YOU !";
    }

    @GetMapping("/demo")
    public String demo(){
        return demoService.demo();
    }

    @RequestMapping("/index")
    public String index(String param){
        return demoService.index(param);
    }

    @RequestMapping("makeErr")
    public int makeErr(int a,int b){
        return demoService.makeErr(a,b);
    }
}
