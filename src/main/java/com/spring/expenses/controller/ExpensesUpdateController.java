package com.spring.expenses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.expenses.dto.ExpensesDTO;
import com.spring.expenses.service.ExpensesService;

@RestController
public class ExpensesUpdateController {
	
	
	@Autowired
	ExpensesService expensesService;
	
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteExpense(@PathVariable Long id){
		
		boolean deleteExp = expensesService.deleteExp(id);
		
		if(deleteExp==true) {
			return ResponseEntity.ok("Deleted");
		}
		
		return ResponseEntity.ok("No Expense Found");
		
		
	}

}
