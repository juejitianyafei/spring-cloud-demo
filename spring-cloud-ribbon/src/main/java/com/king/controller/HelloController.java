package com.king.controller;

import com.king.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author king.wyx@qq.com
 * @date 2018.09.24
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(String username) {
        return helloService.hi(username);
    }

}
