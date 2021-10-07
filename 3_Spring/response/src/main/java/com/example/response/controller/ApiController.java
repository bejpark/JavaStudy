package com.example.response.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {
	//TEXT
	@GetMapping("/text") //GET
	public String text(@RequestParam String account) {
		return account;
	}

	//JSON
	@PostMapping("/json") //POST
	//req->object mapper -> object -> method -> object mapper -> json -> response
	public User json(@RequestBody User user) {
		return user;
	}
	
	//ResponseEntity
	@PutMapping("/put") //PUT
	public ResponseEntity<User> put(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(user);		
	}
}


/*
{
	"name":"yuna",
	"age":10,
	"phoneNumber" : "010-1111-2222",
	"address" : "서울시"
}

*/