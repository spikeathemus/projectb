package com.example.projectb.controllers;

import com.example.projectb.entities.Expense;
import com.example.projectb.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
    private ExpenseRepository expenseRepository;
    Expense exampleExpense = new Expense(8,BigDecimal.TEN,BigDecimal.TEN,"nope", "nope");
    Expense exampleSecondExpense =
            new Expense(7,BigDecimal.valueOf(345),BigDecimal.valueOf(674),"internal", "january integration");
    private void saveExpense(Expense expense){expenseRepository.save(expense);} /*for future operations*/


    @Autowired
    public ExpenseController(ExpenseRepository expenseRepository){this.expenseRepository = expenseRepository;
        expenseRepository.save(exampleExpense);
        expenseRepository.save(exampleSecondExpense);}

    @GetMapping("/1")
    public String tryMeForHomeWeb(){return "home";}
    @GetMapping("/all")
    public String findAllExpenses(Model model){

        List<Expense>findAllExpenses =expenseRepository.findAll(); //add somehow
        model.addAttribute("list",findAllExpenses);

        return "secondPage";
    }
    @PostMapping
    public String addNewExpense(Model model){
        return "secondPage";
    }



}
