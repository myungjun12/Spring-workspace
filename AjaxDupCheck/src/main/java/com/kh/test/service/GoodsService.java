package com.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.test.mapper.GoodsMapper;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	public boolean getGoods(String item_name) {
		//null이 아니다 0 또는 1이상 count 0보다 클 때 반환
		return (goodsMapper.getGoods(item_name) == 1 ? true : false); 
	} 
}
