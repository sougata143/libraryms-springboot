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
public class Books {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;
    public String writer;
    public String publisher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Books() {
    }

    public Books(String name, String writer, String publisher) {
        this.name = name;
        this.writer = writer;
        this.publisher = publisher;
    }
}
