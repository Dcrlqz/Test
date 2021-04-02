package com.xf.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class adminController {

    @GetMapping("/adminInfo")
    public String admin(){
        return "这是用户信息";
    }

    @GetMapping("/adminInf1")
    public String admin1(){
        return "这是用户信息";
    }
}
