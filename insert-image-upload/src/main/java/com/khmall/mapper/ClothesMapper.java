package com.khmall.mapper;

import java.util.List;

import com.khmall.dto.Clothes;

public interface ClothesMapper {
	// 옷 모든 정보 List로 불러오겠다.
	List<Clothes> getAllClothes();
	
	// 옷 정보 업로드 하겠다. 
	public void uploadClothes(Clothes clothes);
}
