package org.feign.consumer.service;

import org.springframework.stereotype.Service;

@Service
public class FeignFallbackService implements CalculateFeignService{
	
	@Override
	public String hello(String name) {
        return "No Response";
	}
	
	@Override
	public String Add(int a, int b) {
        return "No Response";
	}

	@Override
	public String Minus(int a, int b) {
        return "No Response";
	}

	@Override
	public String Times(int a, int b) {
        return "No Response";
	}

	@Override
	public String Divide(int a, int b) {
        return "No Response";
	}

    @Override
    public String testHystrix(String name) {
        return "No Response";
    }
}