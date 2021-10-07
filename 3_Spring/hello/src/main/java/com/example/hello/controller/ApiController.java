package com.example.hello.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "MyPC SpringBoot";
	}
	
	@GetMapping("/date")
	public String getServerDate() {
		return "서버측 날짜 : "+new Date()+" 입니다.";
	}

}
