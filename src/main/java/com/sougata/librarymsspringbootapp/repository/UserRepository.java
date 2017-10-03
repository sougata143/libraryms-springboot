package com.sougata.librarymsspringbootapp.repository;

import com.sougata.librarymsspringbootapp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public User getById(Long id);
    public User getByName(String name);
}