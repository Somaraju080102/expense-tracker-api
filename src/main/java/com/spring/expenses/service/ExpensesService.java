package com.spring.expenses.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.expenses.dto.ExpensesDTO;
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
		
		 String name = expensesCategory.getName().trim().toLowerCase();

		    return categoryRepo.findByName(name)
		            .orElseGet(() -> {
		                ExpensesCategory newCat = new ExpensesCategory();
		                newCat.setName(name); 
		                return categoryRepo.save(newCat);
		            });		
		
	}

	public ExpensesEntity saveExpenses(ExpensesDTO expensesDTO) {	
		
		Long catId = expensesDTO.getCategoryId();
	    if (catId == null) {
	        throw new IllegalArgumentException("Category ID must not be null");
	    }
	    
	    ExpensesCategory category = categoryRepo.findById(catId)
	        .orElseThrow(() -> new IllegalArgumentException("Category not found with id: " + catId));

	    ExpensesEntity expensesEntity = new ExpensesEntity();
	    expensesEntity.setCategory(category);
	    expensesEntity.setAmount(expensesDTO.getAmount());
	    expensesEntity.setDescription(expensesDTO.getDescription());
	    expensesEntity.setExpenseDate(expensesDTO.getExpenseDate());

	    return expensesRepo.save(expensesEntity);
		
		
		
	}

	public List<ExpensesEntity> getExpenses() {
		
		List<ExpensesEntity> all = expensesRepo.findAll();
		
		
		return all;
		
	}

	public ExpensesEntity gexpid(Long id) {
		
		Optional<ExpensesEntity> byId = expensesRepo.findById(id);
		
		if(byId==null) {
			return null;
		}
		else {
			return byId.get();
		}
		
	}

	public boolean deleteExp(Long id) {
		// TODO Auto-generated method stub
		
		Optional<ExpensesEntity> byId = expensesRepo.findById(id);
		
		
		if(!byId.isEmpty()){
			expensesRepo.deleteById(id);
		return true;
		}
		
////		ExpensesEntity expensesEntity = byId.get();
////		
////		Long id2 = expensesEntity.getId();
//		
//		System.out.println("Deleted value"+id2);
//		
//		if(expensesEntity.getId()!=null) {
//			expensesRepo.deleteById(id);
//			return true;
//		}
		
		
		return false;
		
	}

	
	
	
	

}
