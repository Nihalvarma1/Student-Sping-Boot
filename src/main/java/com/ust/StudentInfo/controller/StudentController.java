package com.ust.StudentInfo.controller;

import com.ust.StudentInfo.model.Student;
import com.ust.StudentInfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/addstudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }

    @GetMapping("/getallstudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getstudentbyid/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deletestudentbyid/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
}
