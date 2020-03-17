package com.king.controller;

import com.king.service.FeignHelloService;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author king.wyx@qq.com
 * @date 2018.09.24
 */
@RestController
public class HelloController {

    @Resource
    FeignHelloService feignHelloService;

    @GetMapping("/hi")
    public String hi(String username) {
        return feignHelloService.hi(username);
    }

    @GetMapping("/hello")
    public String hello(String username) {
        return "success";
    }

}
