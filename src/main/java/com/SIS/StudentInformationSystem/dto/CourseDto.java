package com.SIS.StudentInformationSystem.dto;

import com.SIS.StudentInformationSystem.enumeration.Status;

import lombok.Data;

@Data
public class CourseDto {

	private Integer id;

	private String name;

	private Integer seats;

	private Integer courseTypeId;

	private Status status;
}
