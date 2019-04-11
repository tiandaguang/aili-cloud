package com.tdg.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudConfig")
@RefreshScope
public class CloudConfigController {

    @Value("${test.name}")
    private String name;

    @RequestMapping("/get")
    public String get() {
        return name;
    }
}