package com.sougata.librarymsspringbootapp.repository;

import com.sougata.librarymsspringbootapp.domain.Books;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface BookRepository  extends JpaRepository<Books, Long> {
    @Modifying
    @Transactional
    @Query("Update  Books b set b.name = :name, b.writer= :writer, b.publisher = :publisher where b.id=:id" )
    public void updateById(@Param("id") Long id, @Param("name") String name
    ,@Param("writer") String writer, @Param("publisher") String publisher);

    public Books getById(Long id);

}