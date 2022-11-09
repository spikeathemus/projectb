package com.example.projectb.controllers;

import com.example.projectb.entities.Expense;
import com.example.projectb.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
    private ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseController(ExpenseRepository expenseRepository){this.expenseRepository = expenseRepository;}


    private void saveExpense(Expense expense){expenseRepository.save(expense);};

}
