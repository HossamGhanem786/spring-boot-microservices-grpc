package com.ntg.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GrpcProductSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcProductSpringBootApplication.class, args);
	}

}
