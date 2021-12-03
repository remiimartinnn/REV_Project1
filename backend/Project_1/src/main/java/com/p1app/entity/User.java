package com.p1app.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "pw")
    private String pw;

    @OneToMany(
            mappedBy = "user",
            targetEntity = Account.class,
            fetch = FetchType.LAZY
    )


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", " + "email=" + email + "username=" + username + "pw=" +
                pw + '\'' +
                '}';
    }

}







