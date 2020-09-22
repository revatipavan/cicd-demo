package com.example.cicd.cicddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class FirstRestAPI {
	
	public String helloWorld() {
		return "Hello World";
	}

}
