package com.example.MongodbProject.Service;

import com.example.MongodbProject.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student getStudentById(String id);
    List<Student> getAllStudents();
    void deleteStudentById(String id);
    List<Student> getStudentsByYearOfEnrollement(int year);
    List<Student> getStudentsByDepartment(String department);
    void deleteStudentsByYearOfEnrollement(int year);
}

