package com.example.herokuspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuSpringbootApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World!";
	}
}
