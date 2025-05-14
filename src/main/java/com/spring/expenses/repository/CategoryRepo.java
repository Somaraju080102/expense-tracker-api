package com.spring.expenses.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.expenses.entity.ExpensesCategory;

@Repository
public interface CategoryRepo extends JpaRepository<ExpensesCategory, Long>{

	Optional<ExpensesCategory> findByName(String name);

}
