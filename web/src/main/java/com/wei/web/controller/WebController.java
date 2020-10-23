package com.wei.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class WebController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value="/getUser")
    public String getUser() {
        return "wei" + serverPort;
    }
}
