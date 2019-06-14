package org.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider-service" , fallback = FeignFallbackService.class)
//@FeignClient(name = "provider-service")
public interface CalculateFeignService {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    
    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    String Add(@RequestParam("a") int a,
            @RequestParam("b") int b);

    @RequestMapping(value = "/minus" , method = RequestMethod.GET)
    String Minus(@RequestParam("a") int a,
              @RequestParam("b") int b);

    @RequestMapping(value = "/times" , method = RequestMethod.GET)
    String Times(@RequestParam("a") int a,
              @RequestParam("b") int b);

    @RequestMapping(value = "/divide" , method = RequestMethod.GET)
    String Divide(@RequestParam("a") int a,
              @RequestParam("b") int b);

    @RequestMapping(value = "/testHystrix" , method = RequestMethod.GET)
    String testHystrix(@RequestParam("name") String name);
}