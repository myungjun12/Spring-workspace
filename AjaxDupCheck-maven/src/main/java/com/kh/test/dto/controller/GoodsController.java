package com.kh.test.dto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.test.dto.service.GoodsService;


@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/")
	public String htmlStart() {
		return "index";
	}
	
	@ResponseBody //json Type으로 값을 가져오겠다.
	@GetMapping("/itemCheck")
	public Map<String, Object> getGoods(@RequestParam String item_name) {
		Map<String, Object> res = new HashMap<>();
		
		boolean isCheck = goodsService.getGoods(item_name);
		res.put("isCheck", isCheck);
		
		return res;
	}
}
