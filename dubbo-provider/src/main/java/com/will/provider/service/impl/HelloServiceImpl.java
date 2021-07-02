package com.will.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.will.api.service.HelloService;

@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello " + name + ",This is springboot-dubbo test";
    }
}
