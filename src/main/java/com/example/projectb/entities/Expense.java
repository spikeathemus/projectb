package com.example.projectb.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Expense {
    @Id
    int id;
    BigDecimal amount;
    BigDecimal createdAt;
}
