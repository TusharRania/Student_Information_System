package com.SIS.StudentInformationSystem.dto;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;

import lombok.Data;

@Data
public class SemesterDto {

//	private Integer id;

	private Integer courseId;

	private List<Integer> semesterCount;

	private Status status;

}
