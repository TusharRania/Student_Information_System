package com.SIS.StudentInformationSystem.response;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.enumeration.SubjectType;

import lombok.Data;

@Data
public class SubjectResponse {

	private Integer id;

	private String subject;

	private String course;

	private String semester;

	private SubjectType subjectType;
	
	private Status status;

}
