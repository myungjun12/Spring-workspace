package com.example.demo.dto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller //db와 templates을 연결해주는 연결고리
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	//회원가입을 위해 작성할 GetMapping 작성하기
	@GetMapping("/")
	public String registerForm(Model model) {
		model.addAttribute("mem", new Member());
		return "index";
	}
	//나중에 회원가입을 완료하면 보일 PostMapping
	@PostMapping("/register")
	public String 회원가입완료(Member memer, Model model) {
		//회원가입 작성이 완료가 되면 db에 저장하겠다.
		//마찬가지로 멤버가입으로 작성한 메서드기능 호출명을 insertMember로 변경하기
		memberService.insertMember(memer);
		// model.addAttribute("select 로 db에 저장된 회원가입정보 가져오기"
		model.addAttribute("msg", "멤버가 성공적으로 가입되었습니다.");
		return "success";
	}
}
