package com.sougata.librarymsspringbootapp.controller;

import com.sougata.librarymsspringbootapp.domain.Books;
import com.sougata.librarymsspringbootapp.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library/books")
public class BookController {
    private final Logger log = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public Iterable<Books> listBooks(){
        return bookService.list();
    }

    @GetMapping("/{name}")
    public Books listBooksByName(@PathVariable("name") String name){
        return bookService.getByName(name);
    }

    @PostMapping("/")
    public Books save( @RequestBody Books books){
        return bookService.save(books);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") long id){
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable("id") long id, @RequestBody Books book){

        bookService.update(id, book);
    }



}