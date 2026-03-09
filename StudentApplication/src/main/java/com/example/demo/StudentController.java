package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Value("${env}")
	String envValues;
	
	
	@GetMapping("get")

	public String getEnv() {
		return envValues;
	}
}
