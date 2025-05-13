package com.spring.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.expenses.entity.ExpensesCategory;

@Repository
public interface CategoryRepo extends JpaRepository<ExpensesCategory, Long>{

}
