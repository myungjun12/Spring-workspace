package com.khmall.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Clothes;
import com.khmall.service.ClothesService;

@Controller
public class ClothesController {
	
	@Autowired
	private ClothesService clothesService;
	
	@GetMapping("/")
	public String getAllClothes(Model model) {
		List<Clothes> clothes = clothesService.getAllClothes();
		model.addAttribute("clothes",clothes);
		return "index";
	}
}
