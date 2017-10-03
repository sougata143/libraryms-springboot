package com.sougata.librarymsspringbootapp.service;


import com.sougata.librarymsspringbootapp.domain.Books;
import com.sougata.librarymsspringbootapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Books> list() {
        return bookRepository.findAll();
    }

    @Override
    public Books save(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public void delete(long id) {
        bookRepository.delete(id);
    }

    @Override
    public Books update(long id,Books book) {

        Books existingBook = bookRepository.getById(id);

        book.setId(existingBook.getId());

        return bookRepository.save(book);
    }

    @Override
    public Books getByName(String name) {
        return bookRepository.getByName(name);
    }


}
