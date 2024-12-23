package com.ecsa.divisas.model;

import jakarta.persistence.*;

import java.util.Currency;
import java.util.Date;

@Entity
public class transactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String type;
    private Double amount;
    private Date date;
    @ManyToOne
    private Currency currency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
