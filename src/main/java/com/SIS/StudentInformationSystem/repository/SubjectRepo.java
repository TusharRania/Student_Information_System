package com.SIS.StudentInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
