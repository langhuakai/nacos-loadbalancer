package com.wei.feign.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("web-service")
public interface FeignService {

    // 此处路径要写全。比如调用接口的请求路径为/demo/show，此处也为/demo/show
    @RequestMapping("/web/getUser")
    public String show();
}
