package com.sugon.gaowz.controller;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: workplace-sugon-salon
 * @description: 手动下线服务
 * @date: 10:18 2021/4/21
 * @author: gaowz
 **/
@RestController
@RequestMapping("/provider")
public class OfflineController {

    @GetMapping("/offline")
    public void offLine(){
        DiscoveryManager.getInstance().shutdownComponent();
    }


    @GetMapping("/online")
    public void onLine(){

    }
}
