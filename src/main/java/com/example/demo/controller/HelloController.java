package com.example.demo.controller;

import com.example.demo.commom.CommomResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public CommomResult<String> hello(){

    return new CommomResult<String>("0","成功1");
    }
}
