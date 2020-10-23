package com.wei.gateway.config;

/*public class NacosBalanceConfig {
}*/

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class NacosBalanceConfig {

    @Bean
    @Scope(value="prototype")
    public IRule loadBalanceRule(){
        return new NacosRule();
    }
}
