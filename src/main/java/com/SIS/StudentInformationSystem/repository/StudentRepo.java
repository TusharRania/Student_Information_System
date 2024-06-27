package com.SIS.StudentInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.student.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
