package com.jen.jenkinsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yanglihu
 * @ClassName HelloController
 * @Description TODO
 * @Date 2021/6/11 11:22
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins！！！";
    }
}
