package com.sougata.librarymsspringbootapp.repository;

import com.sougata.librarymsspringbootapp.domain.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository  extends CrudRepository<Books, Long>{
}