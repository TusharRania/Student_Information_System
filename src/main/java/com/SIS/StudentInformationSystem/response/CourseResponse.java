package com.SIS.StudentInformationSystem.response;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;

import lombok.Data;
@Data
public class CourseResponse {
	private Integer id;

	private String name;

	private Integer seats;

	private String courseType;

	private List<String> semester;

	private Status status;
}
