package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class exampleController {
	@GetMapping("example") //   /example Get 방식 요청 매핑
	public String exampleMethod() {
		return "example";
	}
}
