package com.kh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexController {

	@GetMapping("/")
	public String htmlStart() {
		return "redirect:/index.html";
	}
}
