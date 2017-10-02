package com.sougata.librarymsspringbootapp.service;


import com.sougata.librarymsspringbootapp.domain.Student;
import com.sougata.librarymsspringbootapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> list() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(long id) {
        studentRepository.delete(id);
    }

    @Override
    public Student update(long id, Student student) {

        Student student1 = studentRepository.getById(id);
        student.setId(student1.getId());

        return studentRepository.save(student);
    }
}
