package org.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider-service")
public interface CalculateFeignService {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    int Add(@RequestParam("a") int a,
            @RequestParam("b") int b);

    @RequestMapping(value = "/minus" , method = RequestMethod.GET)
    int Minus(@RequestParam("a") int a,
              @RequestParam("b") int b);

    @RequestMapping(value = "/times" , method = RequestMethod.GET)
    int Times(@RequestParam("a") int a,
              @RequestParam("b") int b);

    @RequestMapping(value = "/divide" , method = RequestMethod.GET)
    double Divide(@RequestParam("a") int a,
              @RequestParam("b") int b);
    
}