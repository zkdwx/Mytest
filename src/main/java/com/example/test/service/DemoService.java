package com.example.test.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String demo(){
        return "This is a demo !";
    }

    public String index(String param){
        return param;
    }

    public int makeErr(int a,int b){
        return a/b;
    }
}
