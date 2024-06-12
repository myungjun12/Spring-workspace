package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.dto.BlogDTO;

import lombok.extern.slf4j.Slf4j;

//어노테이션(@) 이용해서, controller requestMapping("blog",slf4j 설정)
@Controller
@RequestMapping("blog")
@Slf4j
//<label>이름:</label> <input type="text" name="commentName"> 
//<label>의견:</label><input type="text" name="commentOpinion">
public class BlogController {
	// 메서드명 : blogComment 
	// 어노테이션(@) 이용 PostMapping(comment) 만들고
	// @RequestParam 이용해서 blog-index.html 파일에 작성한
	// commentName, commentOpinion 작성하기
	// required=true 
	// return "redirect:/blog/blog-index"
	@PostMapping("comment")
	public String blogComment(BlogDTO blogDTO){
		
		log.info("블로그 댓글 작성 공간");
		
		BlogDTO bd = new BlogDTO();
		bd.getCommentName();
		bd.getCommentOpinion();
		
		bd.setCommentName("홍길동");
		bd.setCommentOpinion("잘봤습니다.");
		
		log.info("bd에 작성한 내용 보기 : " + bd.toString());
		
		return "redirect:/blog/blog-index";
		
	}
}
