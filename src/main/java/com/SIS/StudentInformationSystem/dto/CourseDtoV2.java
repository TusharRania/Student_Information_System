package com.SIS.StudentInformationSystem.dto;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;

import lombok.Data;

@Data
public class CourseDtoV2 {

	private Integer id;

	private String name;

	private Integer seats;

	private Integer courseTypeId;

	private List<Integer> semester;

	private Status status;
}
