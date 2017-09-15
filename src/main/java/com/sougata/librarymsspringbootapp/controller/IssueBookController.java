package com.sougata.librarymsspringbootapp.controller;

import com.sougata.librarymsspringbootapp.domain.Issued;
import com.sougata.librarymsspringbootapp.service.IssueBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library")
public class IssueBookController {

    private final Logger log = LoggerFactory.getLogger(IssueBookController.class);
    @Autowired
    private IssueBookService issueBookService;

    public IssueBookController(IssueBookService issueBookService) {
        this.issueBookService = issueBookService;
    }

    @GetMapping("/issuebooks")
    public Iterable<Issued> listIssueBooks(){
        return issueBookService.list();
    }

    @PostMapping("/saveissuebooks")
    public Issued save(Issued issued){
        return issueBookService.save(issued);
    }

    @DeleteMapping("/deleteissue/{id}")
    public void deleteIssuedbooks(@PathVariable("id") long id){
        issueBookService.delete(id);
    }

    @PutMapping("/updateissue/{id}")
    public Issued updateIssuedBooks(@PathVariable("id") Issued issued){
        return issueBookService.update(issued);
    }


}