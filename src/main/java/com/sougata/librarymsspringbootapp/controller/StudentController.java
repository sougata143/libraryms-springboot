package com.sougata.librarymsspringbootapp.controller;

import com.sougata.librarymsspringbootapp.domain.Student;
import com.sougata.librarymsspringbootapp.repository.StudentRepository;
import com.sougata.librarymsspringbootapp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library/student")
public class StudentController {
    private final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public Iterable<Student> listStudents(){
        return studentService.list();
    }

    @GetMapping("/{name}")
    public Student listStudentsByName(@PathVariable("name") String name){
        return  studentService.getByName(name);
    }

    @PostMapping("/")
    public Student save( @RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") long id){
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") long id, @RequestBody Student student){

        return studentService.update(id, student);
    }

}