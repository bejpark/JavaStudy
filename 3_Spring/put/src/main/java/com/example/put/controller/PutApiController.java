package com.example.put.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PostRequestDto;

@RestController
@RequestMapping("/api") //PUT 선택
public class PutApiController {
	
	@PutMapping("/put")
	public void put(@RequestBody PostRequestDto dto) {
		System.out.println(dto);
	}

}
/*
{
	"name":"bejpark",
	"age":33,
	"car_list":[
      {
        "name":"car1",
        "car_number":"1111"
      },
      {
        "name":"car1",
        "car_number":"1111"
      }
    ]	
}
*/