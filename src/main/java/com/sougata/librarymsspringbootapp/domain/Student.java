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
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String sub;
    private int age;
    private String contact;

    public Student() {
    }

    public Student(String name, String email, String sub, int age, String contact) {
        this.name = name;
        this.email = email;
        this.sub = sub;
        this.age = age;
        this.contact = contact;
    }
}