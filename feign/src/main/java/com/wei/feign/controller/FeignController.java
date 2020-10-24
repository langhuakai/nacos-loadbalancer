package com.wei.feign.controller;

import com.wei.feign.service.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/getFeign")
    public String getFeign() {
        return feignService.show();
    }
}
