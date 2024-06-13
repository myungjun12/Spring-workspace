package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.MemberDTO;
import com.example.demo.dto.StudentDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("example")
@Slf4j
public class ExampleController {
    @GetMapping("ex1")
    public String ex1(HttpServletRequest req, Model model) {
        req.setAttribute("test1", "HttpServletRequest로 전달한 값");
        model.addAttribute("test2", "Model로 전달한 값");

        model.addAttribute("productName", "종이컵");
        model.addAttribute("price", 2000);
        model.addAttribute("productCompany", "KHCOMPANY");

        List<String> fruitList = new ArrayList<>();
        fruitList.add("사과");
        fruitList.add("딸기");
        fruitList.add("바나나");
        model.addAttribute("fruitList", fruitList);

        List<String> animal = new ArrayList<>();
        animal.add("호랑이");
        animal.add("토끼");
        animal.add("거북이");
        model.addAttribute("animal", animal);

        StudentDTO std = new StudentDTO();
        std.setStudentNO("11111"); 
        std.setName("홍길동");
        std.setAge(30);
        model.addAttribute("std", std);

        MemberDTO mem = new MemberDTO();
        mem.setMemberNO(1234);
        mem.setMemberName("강영희");
        mem.setMemberAge(50);
        model.addAttribute("mem", mem);

        List<StudentDTO> stdList = new ArrayList<>();
        stdList.add(new StudentDTO("1111", "김일번", 10));
        stdList.add(new StudentDTO("2222", "김이번", 20));
        stdList.add(new StudentDTO("3333", "김삼번", 30));
        model.addAttribute("stdList", stdList);

        List<MemberDTO> memList = new ArrayList<>();
        memList.add(new MemberDTO(100, "박세모", 40));
        memList.add(new MemberDTO(200, "윤네모", 60));
        memList.add(new MemberDTO(300, "최다이아", 50));
        model.addAttribute("memList", memList);

        return "example/ex1";
    }

    @GetMapping("/ex2/{number}")
    public String pathVariableTest(@PathVariable("number") int number) {
        return "example/testResult";
    }

    @PostMapping("ex2")
    public String ex2(Model model) {
        model.addAttribute("str", "<h1> 테스트중 &times; </h1>");
        return "example/ex2";
    }
    
    @GetMapping("ex3")
    public String ex3(Model model) {
    	model.addAttribute("boardNo",10);
    	model.addAttribute("key","제목");
    	model.addAttribute("query","검색어");
    	return "example/ex3";
    }
    
}
