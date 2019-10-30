package com.k8s.dubbo.service;

import com.k8s.dubbo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServiceImpl implements DemoService {
    private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String sayHello(String name) {

        log.debug("dubbo say hello to : {}", name);

        return "Hello "+name;
    }
}
