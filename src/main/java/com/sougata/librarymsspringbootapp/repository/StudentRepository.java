package com.sougata.librarymsspringbootapp.repository;

import com.sougata.librarymsspringbootapp.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

    public Student getById(Long id);

}