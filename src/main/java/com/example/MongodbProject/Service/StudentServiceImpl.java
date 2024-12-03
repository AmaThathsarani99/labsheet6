
package com.example.MongodbProject.Service;

import com.example.MongodbProject.model.Student;
import com.example.MongodbProject.Repository.StudentRepository;
import com.example.MongodbProject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentsByYearOfEnrollement(int year) {
        return studentRepository.findByYearOfEnrollement(year);
    }

    @Override
    public List<Student> getStudentsByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }

    @Override
    public void deleteStudentsByYearOfEnrollement(int year) {
        List<Student> students = studentRepository.findByYearOfEnrollement(year);
        studentRepository.deleteAll(students);
    }
}
