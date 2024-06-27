package com.SIS.StudentInformationSystem.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.master.MasterCourseType;

public interface MasterCourseTypeRepo extends JpaRepository<MasterCourseType, Integer> {

}
