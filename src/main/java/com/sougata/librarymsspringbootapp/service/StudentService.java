package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.Student;

public interface StudentService {
    Iterable<Student> list();
    Student save(Student student);
    void delete(long id);
    Student update(long id, Student student);
    Student getByName(String name);
}
