package com.p1app.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    private int id;
    @Column(name = "trans_date")
    public LocalDate date;
    @Column(name = "trans_name")
    public String name;
    @Column(name = "trans_amount")
    public double amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="a_id")
    public Account account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }


}
