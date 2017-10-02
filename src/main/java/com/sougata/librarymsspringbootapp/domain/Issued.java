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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }
}
