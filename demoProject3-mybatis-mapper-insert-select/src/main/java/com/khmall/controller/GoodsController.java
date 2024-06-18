package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.khmall.dto.Goods;
import com.khmall.service.ProductService;

@Controller
public class GoodsController {
	@Autowired 
	private ProductService productService;
	
	@PostMapping("/register-product")
	public String insertProduct(Goods goods, Model model) {
		productService.insertProduct(goods);
		model.addAttribute("msg","상품이 성공적으로 등록됐습니다.");
		return "productList";
	}
}

