package com.ust.StudentInfo.repository;

import com.ust.StudentInfo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
