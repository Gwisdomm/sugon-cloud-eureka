package com.sugon.gaowz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: workplace-sugon-salon
 * @description: EurekaServer7001主启动类
 * @date: 22:35 2021/4/18
 * @author: gaowz
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class,args);
    }
}
