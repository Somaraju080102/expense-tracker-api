package com.spring.expenses.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.expenses.entity.ExpensesCategory;
import com.spring.expenses.entity.ExpensesEntity;
import com.spring.expenses.repository.CategoryRepo;
import com.spring.expenses.repository.ExpensesRepo;

@Service
public class ExpensesService {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	ExpensesRepo expensesRepo;

	public ExpensesCategory saveCategory(ExpensesCategory expensesCategory) {
		
		return categoryRepo.save(expensesCategory);
		
		
	}

	public ExpensesEntity saveExpenses(ExpensesEntity expensesEntity) {
		
		Optional<ExpensesCategory> category=categoryRepo.findById(expensesEntity.getId());
		
		if(category!=null) {
			ExpensesCategory expensesCategory = category.get();
			
			expensesEntity.setCategory(expensesCategory);
			
			expensesRepo.save(expensesEntity);
			
			
		}
		
		return expensesEntity;
		
		
		
	}
	
	
	
	

}
