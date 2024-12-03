package com.example.MongodbProject.Controller;

import com.example.MongodbProject.model.Student;
import com.example.MongodbProject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping("/year/{year}")
    public List<Student> getStudentsByYearOfEnrollement(@PathVariable int year) {
        return studentService.getStudentsByYearOfEnrollement(year);
    }

    @GetMapping("/department/{department}")
    public List<Student> getStudentsByDepartment(@PathVariable String department) {
        return studentService.getStudentsByDepartment(department);
    }

    @DeleteMapping("/year/{year}")
    public void deleteStudentsByYearOfEnrollement(@PathVariable int year) {
        studentService.deleteStudentsByYearOfEnrollement(year);
    }
}


