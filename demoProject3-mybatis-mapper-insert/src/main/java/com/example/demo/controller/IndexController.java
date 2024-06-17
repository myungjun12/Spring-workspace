package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.Drinks;
import com.example.demo.dto.Goods;

@Controller
public class IndexController {
	@GetMapping("/") //맨 앞 페이지에서 볼 화면 띄우기
	public String registerForm(Model model) {
		// DB에 값을 넣을 수 있도록 new Goods()를 이용해서 값이 들어갈 공간을 비어서 만들어주기
		model.addAttribute("drinks", new Drinks());
		model.addAttribute("goods", new Goods());
		return "index";
	}
}
