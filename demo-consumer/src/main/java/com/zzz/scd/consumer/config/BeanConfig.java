package com.zzz.scd.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置java类
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced//负载均注解
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 负载均衡方式
     * @return
     */
    @Bean
    public IRule route(){
        return new RoundRobinRule();
    }
}
