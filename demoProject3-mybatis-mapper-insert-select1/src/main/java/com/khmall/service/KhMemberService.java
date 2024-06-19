package com.khmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.KhMembers;
import com.khmall.mapper.KhMemberMapper;

@Service
public class KhMemberService {
	@Autowired
	private KhMemberMapper khMemberMapper;
	
	public void insertKhMembers(KhMembers khMembers) {
		khMemberMapper.insertKhMembers(khMembers);
	}
	
}
