package com.sougata.librarymsspringbootapp.controller;

import com.sougata.librarymsspringbootapp.domain.Books;
import com.sougata.librarymsspringbootapp.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library")
public class BookController {
    private final Logger log = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public Iterable<Books> listBooks(){
        return bookService.list();
    }

    @PostMapping("/booksave")
    public Books save( Books books){
        return bookService.save(books);
    }

    @DeleteMapping("/bookdelete/{id}")
    public void deleteBook(@PathVariable("id") long id){
        bookService.delete(id);
    }

    @PutMapping("/updatebook/{id}")
    public Books updateBook(@PathVariable("id") Books book){
        return bookService.update(book);
    }

}