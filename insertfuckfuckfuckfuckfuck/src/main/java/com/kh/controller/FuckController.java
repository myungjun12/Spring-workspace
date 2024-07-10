package com.kh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.dto.Fuck;
import com.kh.service.FuckService;

@Controller
public class FuckController {
	@Autowired
	private FuckService fuckService;
	
	@GetMapping("/")
	public String FuckInsert(Model model, Fuck fuck) {
		Fuck fuck = fuckService.FuckInsert(fuck); 
		model.addAttribute("mem",);
		
		return "";
	}
	
}
