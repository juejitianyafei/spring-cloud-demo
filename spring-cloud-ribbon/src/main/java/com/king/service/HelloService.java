package com.king.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author king.wyx@qq.com
 * @date 2018.09.24
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackMethodHi")
    public String hi(String username) {
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hi?name=" + username, String.class);
    }

    /**
     * 参数要一致
     * @param username
     * @return
     */
    public String fallbackMethodHi(String username) {
        return "Ribbon调用失败";
    }

}
