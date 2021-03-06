package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.Books;

public interface BookService {
    Iterable<Books> list();
    Books save(Books books);
    void delete(long id);
    Books update(long id, Books book);
    Books getByName(String name);
}
