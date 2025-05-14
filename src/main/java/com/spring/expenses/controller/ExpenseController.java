package com.spring.expenses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.expenses.dto.ExpensesDTO;
import com.spring.expenses.entity.ExpensesCategory;
import com.spring.expenses.entity.ExpensesEntity;
import com.spring.expenses.service.ExpensesService;


@RestController
public class ExpenseController {
	
	
	@Autowired
	ExpensesService expensesService;
	
	@PostMapping("/category")
	public ResponseEntity<ExpensesCategory> scat(@RequestBody ExpensesCategory expensesCategory ){
		
		
		ExpensesCategory saveCategory = expensesService.saveCategory(expensesCategory);
		
		return ResponseEntity.ok(saveCategory);
		
		
	}
	
	@PostMapping("/expenses")
	public ResponseEntity<ExpensesEntity> sexp(@RequestBody ExpensesDTO expensesDTO){
		
		ExpensesEntity saveExpenses = expensesService.saveExpenses(expensesDTO);
		
		return ResponseEntity.ok(saveExpenses);
	}

}
