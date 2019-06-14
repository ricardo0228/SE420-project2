package org.feign.consumer.service;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonLBConfig {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}