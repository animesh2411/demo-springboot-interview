package com.animax.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHelloById() {
        return "Hello From Demo App";
    }
}
