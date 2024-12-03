package com.example.MongodbProject.Repository;

import com.example.MongodbProject.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByYearOfEnrollement(int year);
    List<Student> findByDepartment(String department);
}
