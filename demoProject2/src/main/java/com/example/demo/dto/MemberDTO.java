package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	private int memberNO; // Controller -> int 값  "" 안 붙이고 사용하겠다.
	private String memberName;// Controller -> String 값  "" 붙이고 사용하겠다.
	private int memberAge;
}
