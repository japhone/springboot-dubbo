package com.japhone.demo.dubbo.service.impl;

import com.japhone.demo.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * created by liukai on 2020-07-15
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String say() {
        return "hello world !";
    }
}
