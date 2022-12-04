package com.example.projectb.service;

import com.example.projectb.entities.Expense;
import com.example.projectb.entities.Worker;
import com.example.projectb.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ExpenseService {
    private ExpenseRepository expenseRepository;
    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
        Expense exampleExpense = new Expense(8, BigDecimal.TEN,2012,"external", "try to reduce cost");
        Expense exampleSecondExpense =
                new Expense(7,BigDecimal.valueOf(345),2000,"internal", "january integration");
        expenseRepository.save(exampleExpense);
        expenseRepository.save(exampleSecondExpense);
    }
    public void saveToRepository(Expense expenseToSave){
        expenseRepository.save(expenseToSave);
    }
    public List<Expense> findAll(){
        List<Expense> newList = expenseRepository.findAll();
        return newList;
    }
//    To Do: połączyć repo żeby w ExpenseController nie trzeba było dodawać rekordów
}
