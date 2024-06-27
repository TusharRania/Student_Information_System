package com.SIS.StudentInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.Semester;

public interface SemesterRepo extends JpaRepository<Semester, Integer> {

	Semester findByCourseIdAndSemesterId(Integer courseId, Integer semesterId);

}
