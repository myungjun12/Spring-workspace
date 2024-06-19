package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.khmall.dto.KhMembers;
import com.khmall.service.KhMemberService;

@Controller
public class KhMembersController {
	
	@Autowired
	private KhMemberService khMembersService;
	
	@PostMapping("/kh")
	public String insertKhMembers(KhMembers khMembers,Model model) {
		khMembersService.insertKhMembers(khMembers);
		model.addAttribute("msg","가입이 완료되었습니다.");
		return "kh-member";
	}
}
