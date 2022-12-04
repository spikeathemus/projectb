package com.example.projectb.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public BigDecimal amount;
    public BigDecimal createdAtYear;
    public String description;
    private String note;
    public Expense(){};

    public Expense(Integer id, BigDecimal amount, int createdAtYear, String description, String note) {
        this.id = id;
        this.amount = amount;
        this.createdAtYear = BigDecimal.valueOf(createdAtYear);
        this.description = description;
        this.note = note;
    }

    public Expense(Integer id) {
        this.id = id;
    }

    public Expense(BigDecimal amount) {
        this.amount = amount;
    }
    public Expense(int createdAtYear){
        this.createdAtYear = BigDecimal.valueOf(createdAtYear);
    }

    public Expense(String description) {
        this.description = description;
    }
//    public Expense(String noteOrDescription){
//        this.note = note;
//    }

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

    public BigDecimal getCreatedAtYear() {
        return createdAtYear;
    }

    public void setCreatedAtYear(BigDecimal createdAt) {
        this.createdAtYear = createdAt;
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

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", createdAtYear=" + createdAtYear +
                ", description='" + description + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
