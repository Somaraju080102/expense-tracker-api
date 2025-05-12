package com.spring.expenses.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ExpensesEntity {
	
	@Id @GeneratedValue
	private Long id;

	@Nonnull
	private String description;
	
	@Nonnull
	private BigDecimal amount;
	
	@Nonnull
	private LocalDate expenseDate;
	
	
	private Category category;
	

}
