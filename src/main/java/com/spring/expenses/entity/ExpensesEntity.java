package com.spring.expenses.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
	
	
	@ManyToOne
	private ExpensesCategory category;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public LocalDate getExpenseDate() {
		return expenseDate;
	}


	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}


	public ExpensesCategory getCategory() {
		return category;
	}


	public void setCategory(ExpensesCategory category) {
		this.category = category;
	}
	
	
	

}
