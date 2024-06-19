package com.khmall.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KhMembers {
//	private member_id; squence로 생성
	private String username;
	private String password;
	private String email;
	private String created_at;
}
