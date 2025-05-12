package com.spring.expenses.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ExpensesCategory {
	
	
	@Id @GeneratedValue
	private Long id ;
	
	
	@Nonnull
	private String name;
	

}
