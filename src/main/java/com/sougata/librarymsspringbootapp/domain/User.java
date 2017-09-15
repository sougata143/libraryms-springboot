package com.sougata.librarymsspringbootapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int urole;
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email, String password, String contact, int urole) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.urole = urole;
    }

    private String password;
    private String contact;
}