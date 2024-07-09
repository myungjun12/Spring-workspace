package com.kh.test.dto;

import lombok.*;

@Getter
@Setter 
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

	private int item_id;
	private String item_name;
	private String item_description;
}
