package com.sugon.gaowz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试转发
 */
@RestController
@RequestMapping("/testnginx")
public class NginxTestController {

    @GetMapping("/getString")
    public String getString(){
        return "currrnt pord is 6001";
    }

}
