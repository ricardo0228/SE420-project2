package main.java.org.feign.provider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String hello(String name){
        return  "hello " + name;
    }
    
    public int add(int a, int b){   
        return  a+b;
    }

    public int minus(int a, int b){   
        return  a-b;
    }

    public int times(int a, int b){   
        return  a*b;
    }

    public int divide(int a, int b){   
          return a/b;
    }

}