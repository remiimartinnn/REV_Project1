package com.p1app.entity;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @Column(name="id")
    public int number;
    @Column(name="acct_balance")
    public double balance;
    @Column(name="acct_name")
    public String name;

    @OneToMany(
            mappedBy = "account",
            targetEntity = Transaction.class,
            fetch = FetchType.LAZY
    )

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="u_id")
    public User user;

    public User getUser() {
        return user;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + number + '\'' +
                ", name=" + name + "balance=" + balance +
                '}';
    }
}
