package com.wei.fdfsservice;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.config.SentinelWebMvcConfig;
import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import(FdfsClientConfig.class)
public class FdfsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdfsServiceApplication.class, args);
    }

}
