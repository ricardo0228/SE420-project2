package org.feign.provider.service;

import org.feign.provider.service.CalculateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @RequestMapping("/hello")
    public String hello(String name){
        CalculateService cs = new CalculateService();
        String res=cs.hello(name);
        return res;
    }
    
    @RequestMapping("/add")
    public int Add(int a, int b){   
        CalculateService cs1 = new CalculateService();
        int resu=cs1.add(a,b);
        return  resu;
    }

    @RequestMapping("/minus")
    public int Minus(int a, int b){   
        CalculateService cs2 = new CalculateService();
        int resul=cs2.minus(a,b);
        return  resul;
    }

    @RequestMapping("/times")
    public int Times(int a, int b){   
        CalculateService cs3 = new CalculateService();
        int result=cs3.times(a,b);
        return result;
    }

    @RequestMapping("/divide")
    public double Divide(int a, int b){   
        CalculateService cs4 = new CalculateService();
        int results=cs4.divide(a,b);
        return results;
    }

}