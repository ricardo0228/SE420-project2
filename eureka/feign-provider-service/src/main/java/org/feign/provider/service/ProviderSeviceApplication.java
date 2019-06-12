package org.feign.provider.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderSeviceApplication.class, args);
	}
}
