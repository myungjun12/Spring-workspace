package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

//8085 에서 실행
// -> Slf4j 추가해주고 log.info 접속확인 log.debug 만들어주기
@Controller
@RequestMapping("param") // ParameterController 밑에는 공통으로 param 붙음
@Slf4j
public class parameterController {
	
	@GetMapping("main")
	public String paramMain(){
		return "param/param-main"; // 
	}
	
	@PostMapping("text")
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName");
		String inputAddress = req.getParameter("inputAddress");
		int inputAge = Integer.parseInt(req.getParameter("inputAge"));
		//--> 기본값 String이기 때문에 int로 형변환
		log.info("");
		return "redirect:/param/main"; // 작성 다 되면 메인으로 돌아가기
	}
}
