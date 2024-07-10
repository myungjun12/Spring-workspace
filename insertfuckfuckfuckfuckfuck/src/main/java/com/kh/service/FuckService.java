package com.kh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.dto.Fuck;
import com.kh.mapper.FuckMapper;

@Service
public class FuckService {
	
	@Autowired
	private FuckMapper fuckMapper;
	
	public void FuckInsert(Fuck fuck) {
	  	fuckMapper.FuckInsert(fuck);
	}
}
