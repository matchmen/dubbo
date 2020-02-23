package com.mt.client.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * author: liqm
 * 2020-02-23
 */
@Component
public class HelloServiceImpl {
    @Reference
    private com.mt.HelloService helloService;

    public String hello(String name) {

        return helloService.hello(name);
    }


}
