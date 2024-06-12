package com.example.demo.model.dto;

import lombok.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@어노테이션 이용해서 constructor, getter, setter, toString
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogDTO {
	private String commentName;
	private String commentOpinion;
}
