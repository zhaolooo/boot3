package com.boot3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

    @RequestMapping("index")
    public String index(){
        return  "Hello Controller";
     //我修改过的
     //在服务器端上改的
    }
}
