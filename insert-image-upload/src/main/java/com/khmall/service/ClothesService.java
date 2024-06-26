package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Clothes;
import com.khmall.mapper.ClothesMapper;

@Service
public class ClothesService {
	
	@Autowired
	private ClothesMapper clothesMapper;
	
	public List<Clothes> getAllClothes(){
		return clothesMapper.getAllClothes();
	}
	
	public void uploadClothes(
			 String clothes_name,
			 int clothes_price,
			 String clothes_category,
			 String clothes_image_path) {
		
	}
}
