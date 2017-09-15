package com.sougata.librarymsspringbootapp.service;

import com.sougata.librarymsspringbootapp.domain.Issued;
import com.sougata.librarymsspringbootapp.repository.IssueBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueBookServiceImpl implements IssueBookService{
    @Autowired
    IssueBookRepository issueBookRepository;

    public IssueBookServiceImpl(IssueBookRepository issueBookRepository) {
        this.issueBookRepository = issueBookRepository;
    }

    @Override
    public Iterable<Issued> list() {
        return issueBookRepository.findAll();
    }

    @Override
    public Issued save(Issued issued) {
        return issueBookRepository.save(issued);
    }

    @Override
    public void delete(long id) {
        issueBookRepository.delete(id);
    }

    @Override
    public Issued update(Issued issued) {
        return issueBookRepository.save(issued);
    }
}
