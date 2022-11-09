package com.example.projectb.entities;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "table_expenses") // check table name
public class Expense {

    @Id
    @GeneratedValue
    public Integer id;
    public BigDecimal amount;
    public BigDecimal createdAt;
    public String description;
    private String note;

    public Expense(int id, BigDecimal amount, BigDecimal createdAt, String description, String note) {
        this.id = id;
        this.amount = amount;
        this.createdAt = createdAt;
        this.description = description;
        this.note = note;
    }
    public Expense(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(BigDecimal createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
