package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("cafe")
@Slf4j
//<label>이름 : </label>
//<input type="text" name="cafeCommentName" required>
//<label>의견 : </label>
//<input type="text" name="cafeCommentOpinion" required>
public class cafeController {
	@PostMapping("comment")
	public String cafeMainComment(@RequestParam("cafeCommentName") String cafeCommentName,
							      @RequestParam("cafeCommentOpinion") String cafeCommentOpinion
							) {
		log.info("카페 메인으로 이동하기");
		log.debug("cafeCommentName : " + cafeCommentName);
		log.debug("cafeCommentOpinion" + cafeCommentOpinion);
		return "redirect:/cafe/cafe-index";
	}
}
