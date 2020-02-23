
package com.mt.server.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mt.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * author: liqm
 * 2020-02-22
 */

@Slf4j
@Service
@Component
public class HelloServiceImpl implements HelloService {

    public String hello(String visitorName) {

        log.info("来访者姓名:{},时间:{}",visitorName, LocalDateTime.now());

        return "你好！" + visitorName + "。欢迎来到Dubbo世界!";
    }
}

