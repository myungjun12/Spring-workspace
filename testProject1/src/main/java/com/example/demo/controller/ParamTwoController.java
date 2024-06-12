package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("param2")
@Slf4j
public class ParamTwoController {
	
	//메서드 paramTwoTest
	@PostMapping("test2")	
	public String paramTwoTest(@RequestParam("snackName") String snackName,
							   @RequestParam("snackCompany") String snackCompany,
							   @RequestParam("snackPrice") int snackPrice,
							   @RequestParam(value="snackLike",defaultValue="snackLike",required=false) String snackLike
	
			) {
		log.info(snackName);
		log.info(snackCompany);
		log.info("snackPrice" + snackPrice);
		log.info(snackLike);
		
//		SnackDTO sd = new SnackDTO();
//		log.info("set 값" + sd.toString());
//		sd.getSnackCompany();
//		sd.getSnackLike();
//		sd.getSnackName();
//		sd.getSnackPrice();
//		log.info("get 값" + sd.toString());
//		sd.setSnackCompany("");
//		sd.setSnackLike("");
//		sd.setSnackName("");
//		sd.setSnackPrice("");
		
		return "redirect:/param/main";
	}
	
	//메서드 paramLikeSnackCompany
	@PostMapping("LikeSnackCompany")  // value에 공통된 네임 값 넣어줘야함 value 넣는거 아님
	public String paramLikeSnackCompany(@RequestParam(value="likeSnack", required=false) String[] likeSnack,
										@RequestParam(value="likeCompany", required=false) List<String> likeCompany
			) {
		log.info("좋아하는 과자들 : " + Arrays.toString(likeSnack));
		log.info("좋아하는 회사들 : " + likeCompany);
		
		return "redirect:/param/main";
	}
	

}
