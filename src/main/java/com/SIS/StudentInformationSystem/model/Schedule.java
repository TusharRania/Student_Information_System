package com.SIS.StudentInformationSystem.model;


import com.SIS.StudentInformationSystem.enumeration.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Schedule extends Base{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer teacherId;

	private Integer courseId;

	private Integer subjectId;
	
	@Enumerated(EnumType. STRING)
	private Status status;

}
