package com.example.demo.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SnackDTO {
//	과자제목 : <input type="text" name="snackName"><br>
//	회   사 : <input type="text" name="snackCompany"><br>
//	가   격 : <input type="text" name="snackPrice"><br>
//	선호 순위 : <input type="text" name="snackLike"><br>
	private String snackName;
	private String snackCompany;
	private String snackPrice;
	private String snackLike;
	
}
