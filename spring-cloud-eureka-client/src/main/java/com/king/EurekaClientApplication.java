package com.king;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author king.wyx@qq.com
 * @date 2018-09-17
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${spring.config.test}")
    private String test;

    @Autowired
    ServerProperties serverProperties;

    @RequestMapping("/hi")
    public String hi(String username) {
        return new StringBuilder().append("hi:").append(username).append(".port:").append(serverProperties.getPort()).toString();
    }

    @GetMapping
    public String configTest(){
        return test;
    }
}
