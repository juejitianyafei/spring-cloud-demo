package com.king.service.fallback;

import com.king.service.FeignHelloService;
import org.springframework.stereotype.Component;

/**
 * @author king.wyx@qq.com
 * @date 2018.09.24
 */
@Component
public class FeignHelloServiceHystric implements FeignHelloService {
    @Override
    public String hi(String username) {
        return "Feign调用失败";
    }
}
