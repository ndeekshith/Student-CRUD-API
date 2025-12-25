package com.Student.studentapi.service;

import org.springframework.stereotype.Service;
import com.Student.studentapi.model.Student;
import com.Student.studentapi.repository.StudentRepository;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    // setter DEpendency injection
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found"));
    }

    public Student updateStudent(Long id, Student updated) {
        Student student = getStudentById(id);
        student.setName(updated.getName());
        student.setEmail(updated.getEmail());
        student.setAge(updated.getAge());
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

}
