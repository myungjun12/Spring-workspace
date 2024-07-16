package com.kh.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.test.service.GoodsService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;

	
	@GetMapping("/itemCheck")
	public Map<String, Object> getGoods(@RequestParam("item_name") String itemName) {
		Map<String, Object> res = new HashMap<>();
		
		boolean isCheck = goodsService.getGoods(itemName);
		
		res.put("isCheck", isCheck);
		System.out.println("isCheck : " + isCheck);
		return res;
	}
}
