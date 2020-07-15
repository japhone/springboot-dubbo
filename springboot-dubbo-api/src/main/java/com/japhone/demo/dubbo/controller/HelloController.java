package com.japhone.demo.dubbo.controller;

import com.japhone.demo.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liukai on 2020-07-15
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/say")
    public String say(){
        return helloService.say();
    }

}
