package com.SIS.StudentInformationSystem.dto;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.enumeration.SubjectType;

import lombok.Data;

@Data
public class SubjectDto {

	private String subject;

	private SubjectType subjectType;

	private Integer courseId;

	private Integer semesterId;

	private boolean isOptional;

	private Status status;

}
