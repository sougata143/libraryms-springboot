package com.sougata.librarymsspringbootapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class Issued {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long bookid;
    private String name;
    private long studentid;
    private String issuedate;

    public Issued() {
    }

    public Issued(long bookid, String name, long studentid, String issuedate) {
        this.bookid = bookid;
        this.name = name;
        this.studentid = studentid;
        this.issuedate = issuedate;
    }
}
