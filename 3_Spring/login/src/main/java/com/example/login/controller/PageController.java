package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.UserDto;
import com.example.login.repository.UserRepository;

@RestController
public class PageController {
	
	@Autowired
	private UserRepository user;
	
	@PostMapping("/signup")
	public String login(UserDto dto) {
		try {
			user.save(dto);
		}catch(Exception e) {
			return "회원가입 실패";
		}
		return "회원가입 성공<br><a href=\"/index.html\"/>로그인하기";
	}
	
	@PostMapping("/login")
	public String success(UserDto dto) {
		UserDto member;
		try {
			member=(UserDto)user.findById(dto.getId());
		}catch(Exception e){
			return "없는 회원";
		}
		return "회원 "+member.getUserno()+", "+member.getId()+"님 로그인 성공하였습니다.";
	}
	

}
