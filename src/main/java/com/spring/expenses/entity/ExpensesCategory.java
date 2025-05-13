package com.spring.expenses.entity;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ExpensesCategory {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Nonnull
	private String name;
	
	
	@OneToMany(mappedBy = "category")
	private List<ExpensesEntity> expenses;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<ExpensesEntity> getExpenses() {
		return expenses;
	}


	public void setExpenses(List<ExpensesEntity> expenses) {
		this.expenses = expenses;
	}
	
	
	
	

}
