package com.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author king.wyx@qq.com
 * @date 2018.11.03
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigApplication {
    //test http://localhost:8086/spring.application.test/dev
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
