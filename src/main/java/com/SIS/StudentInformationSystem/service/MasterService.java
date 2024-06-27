package com.SIS.StudentInformationSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SIS.StudentInformationSystem.model.master.MasterCourseType;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MasterService {

	private MasterCourseTypeRepo masterCourseTypeRepo;

	public String addCourseType(MasterCourseType masterCourseType) {
		masterCourseType=masterCourseTypeRepo.save(masterCourseType);
		
		return "Added Sucessfully "+masterCourseType.getId();
	}

	public List<MasterCourseType> getAllCourseType() {
		return masterCourseTypeRepo.findAll();
	}
}
