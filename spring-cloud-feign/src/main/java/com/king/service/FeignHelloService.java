package com.king.service;

import com.king.service.fallback.FeignHelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author king.wyx@qq.com
 * @date 2018.09.24
 */
@FeignClient(value = "spring-cloud-eureka-client",fallback = FeignHelloServiceHystric.class)
public interface FeignHelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam("username") String username);
}
