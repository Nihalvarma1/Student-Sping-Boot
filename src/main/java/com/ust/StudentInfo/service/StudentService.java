package com.ust.StudentInfo.service;

import com.ust.StudentInfo.model.Student;
import com.ust.StudentInfo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> addStudents(List<Student> students) {
        return studentRepo.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Student updateStudent(Student student) {
        Student existingStudent = studentRepo.findById(student.getId()).orElse(null);
        if(existingStudent != null){
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setBranch(student.getBranch());
            existingStudent.setGrade(student.getGrade());
        }
        return studentRepo.save(student);
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);
        return "Student with id " + id + " deleted successfully";
    }
}
