package com.thoughtmechinics.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class EagleEyeLicensingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EagleEyeLicensingServiceApplication.class, args);
	}

}
