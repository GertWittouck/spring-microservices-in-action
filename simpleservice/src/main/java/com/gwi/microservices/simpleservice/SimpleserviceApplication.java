package com.gwi.microservices.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class SimpleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleserviceApplication.class, args);
	}

	@GetMapping("/{firstName}/{lastName}")
	public String hello(@PathVariable() String firstName, @PathVariable() String lastName) {
		return String.format("{\"message\": \"Hello %s %s\"}", firstName, lastName);
	}

}
