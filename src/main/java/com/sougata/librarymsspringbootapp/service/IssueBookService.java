package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.Issued;

public interface IssueBookService {
    Iterable<Issued> list();
    Issued save(Issued issued);
    void delete(long id);
    Issued update(long id,Issued issued);
}
