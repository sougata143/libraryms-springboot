package com.sougata.librarymsspringbootapp.repository;

import com.sougata.librarymsspringbootapp.domain.Issued;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueBookRepository extends CrudRepository<Issued, Long>{
}