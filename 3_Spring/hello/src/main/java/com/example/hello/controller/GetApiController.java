package com.example.hello.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.dto.UserRequest;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "get Hello";
	}
	
	@RequestMapping(path="/hi", method= RequestMethod.GET)
	public String hi() {
		return "hi";
	}
	
	@GetMapping("/pathVariable/{aa}")
	public String pathVariable(@PathVariable(name="aa") String bb) {
		return bb;
	}
	
	@GetMapping(path="query-param")
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		StringBuffer sb = new StringBuffer();
		
		queryParam.entrySet().forEach(entry->{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
			
		});
		return sb.toString();
	}
	
	@GetMapping("/query-param02")
	public String queryParam02(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam int age) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		return name+" "+email+" "+age;
	}
	
	
	@GetMapping("/query-param03")
	public String queryParam03(UserRequest request) { //객체타입 리턴은 @RequestParam 사용안함
		System.out.println(request.getName());
		System.out.println(request.getEmail());
		System.out.println(request.getAge());
		return request.toString();
	}
}
