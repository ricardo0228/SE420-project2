package org.feign.provider.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String hello(String name){
        return  "Hello " + name + "!";
    }
    
    public int add(int a, int b){   
        return  a + b;
    }

    public int minus(int a, int b){   
        return  a - b;
    }

    public int times(int a, int b){   
        return  a * b;
    }

    public double divide(int a, int b){   
        return a * 1.0 / b;
    }

}