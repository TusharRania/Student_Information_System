package com.SIS.StudentInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

	
}
