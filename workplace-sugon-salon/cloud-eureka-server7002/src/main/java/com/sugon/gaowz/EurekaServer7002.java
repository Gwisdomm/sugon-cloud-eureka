package com.sugon.gaowz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: workplace-sugon-salon
 * @description:
 * @date: 10:44 2021/4/20
 * @author: gaowz
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class,args);
    }
}
