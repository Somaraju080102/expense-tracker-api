package com.spring.expenses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.expenses.dto.ExpensesDTO;
import com.spring.expenses.entity.ExpensesEntity;
import com.spring.expenses.service.ExpensesService;

@RestController
public class ExpensesGetController {
	
	
	@Autowired
	ExpensesService expensesService;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ExpensesEntity>> getAllExpenses(){
		
		List<ExpensesEntity> expenses = expensesService.getExpenses();
		
		return ResponseEntity.ok(expenses);
	}
	
	@GetMapping("/getId/{id}")
	public ResponseEntity<ExpensesEntity> getExpenseById(@PathVariable Long id){
		
		ExpensesEntity gexpid = expensesService.gexpid(id);
		
		return ResponseEntity.ok(gexpid);
	}
}
