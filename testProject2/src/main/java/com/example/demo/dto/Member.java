package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor  // 기본
@AllArgsConstructor // 필수

public class Member {
	private String memberName;
	private String memberPhone;
	private int memberAge;
}
