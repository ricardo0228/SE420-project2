package org.feign.provider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalculateController {
    CalculateService cs = new CalculateService();

    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request){
        return  " From Port : " + request.getServerPort() + "\n" + cs.hello(name);
    }
    
    @RequestMapping("/add")
    public String Add(int a, int b, HttpServletRequest request){   
        int result=cs.add(a,b);
        return  " From Port : " + request.getServerPort() + "\nValue : " + String.valueOf(result);
    }

    @RequestMapping("/minus")
    public String Minus(int a, int b, HttpServletRequest request){   
        int result=cs.minus(a,b);
        return  " From Port : " + request.getServerPort() + "\nValue : " + String.valueOf(result);
    }

    @RequestMapping("/times")
    public String Times(int a, int b, HttpServletRequest request){   
        int result=cs.times(a,b);
        return  " From Port : " + request.getServerPort() + "\nValue : " + String.valueOf(result);
    }

    @RequestMapping("/divide")
    public String Divide(int a, int b, HttpServletRequest request){   
    	double result=cs.divide(a,b);
        return  " From Port : " + request.getServerPort() + "\nValue : " + String.valueOf(result);
    }

    @RequestMapping("/testHystrix")
    public String testHystrix(String name, HttpServletRequest request){   
    	try {
            Thread.sleep(5 * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  " From Port : " + request.getServerPort() + "\nHello " + name + "! This is a test about Hystrix.";
    }
}