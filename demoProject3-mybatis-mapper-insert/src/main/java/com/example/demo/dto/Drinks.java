package com.example.demo.dto;

import lombok.*;

@Setter 
@Getter 
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Drinks {
		private    int drinksId;    
	    private String drinksName;    
	    private int drinksPrice;
	    private int drinksQuantity;
}
