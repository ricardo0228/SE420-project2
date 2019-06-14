package org.feign.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired private CalculateFeignService feignService;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(String name){
        return feignService.hello(name);
    }
    
    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public String add(int a, int b){
        return feignService.Add(a, b);
    }

    @RequestMapping(value = "/minus" , method = RequestMethod.GET)
    public String minus(int a, int b){
        return feignService.Minus(a, b);
    }

    @RequestMapping(value = "/times" , method = RequestMethod.GET)
    public String times(int a, int b){
        return feignService.Times(a, b);
    }

    @RequestMapping(value = "/divide" , method = RequestMethod.GET)
    public String divide(int a, int b){
        return feignService.Divide(a, b);
    }

    @RequestMapping(value = "/testHystrix" , method = RequestMethod.GET)
    public String testHystrix(String name){
        return feignService.testHystrix(name);
    }
}