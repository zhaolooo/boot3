package com.boot3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

    @RequestMapping("index")
    public String index(){
        return  "Hello Controller";

    }
}
