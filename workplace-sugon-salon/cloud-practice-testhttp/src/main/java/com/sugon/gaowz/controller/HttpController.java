package com.sugon.gaowz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaowz
 * @version 2.10
 * @ClassName HttpController.java
 * @Description TODO
 * @createTime 2021年05月21日 17:41:00
 */
@RestController
public class HttpController {

    @GetMapping("/tostring")
    public String toString(){
        return "hello world";
    }
}
