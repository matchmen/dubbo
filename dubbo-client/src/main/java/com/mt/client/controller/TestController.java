package com.mt.client.controller;

import com.mt.client.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: liqm
 * 2020-02-22
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private HelloServiceImpl helloServiceImpl;

    @PostMapping(value = "/hello")
    public String hello(String name) {

        return helloServiceImpl.hello(name);
    }


}
