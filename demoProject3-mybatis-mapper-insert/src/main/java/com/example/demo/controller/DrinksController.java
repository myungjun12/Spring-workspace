package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Drinks;
import com.example.demo.service.DrinksService;

@Controller
public class DrinksController {
	

	@Autowired
	private DrinksService drinksService;
	
	@PostMapping("/drinks-register")
	public String insertDrinks(Drinks drinks, Model model) {
	
		drinksService.insertDrinks(drinks);
		//log
		model.addAttribute("msg", "상품이 성공적으로 가입됐습니다.");
		return "drinks-register";
	}
	
}
