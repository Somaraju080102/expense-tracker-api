package com.spring.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.expenses.entity.ExpensesEntity;

@Repository
public interface ExpensesRepo extends JpaRepository<ExpensesEntity, Long> {
	

}
