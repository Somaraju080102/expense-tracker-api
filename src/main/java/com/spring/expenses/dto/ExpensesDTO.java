package com.spring.expenses.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.annotation.Nonnull;

public class ExpensesDTO {
	
	 	@Nonnull
	    private String description;

	    private BigDecimal amount;

	    @Nonnull
	    private LocalDate expenseDate;

	    private Long categoryId;

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

		public Long getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}
	    
	    

	    
	    
}
