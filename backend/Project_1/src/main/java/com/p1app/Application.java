package com.p1app;
import com.p1app.entity.Account;
import com.p1app.entity.Transaction;
import com.p1app.entity.TransactionDesc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Application {

    public static void main(String[] args) {

        //CharSequence dateString = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //LocalDate transDate = LocalDate.parse(dateString);
        //transDate = LocalDate.parse(dateString, dtf);
        Account account = new Account();
        Transaction transaction = new Transaction();
        transaction.setAmount(-10.00);
        transaction.setName(String.valueOf(TransactionDesc.FOOD));
        transaction.setDate(LocalDate.parse("2021-11-20", dtf));
        account.number = 1;
        transaction.account=account;
        //wrapper for database connection
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(transaction);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }


}
