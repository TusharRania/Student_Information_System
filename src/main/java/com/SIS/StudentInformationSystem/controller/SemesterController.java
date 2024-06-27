package com.SIS.StudentInformationSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SIS.StudentInformationSystem.dto.SemesterDto;
import com.SIS.StudentInformationSystem.service.SemesterService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Tag(name = "Semester Controller", description = "Rest Controller for APIs related to Semester.")
public class SemesterController {

	private SemesterService semesterService;

	@PostMapping("/addSemester")
	@Operation(description = "Adding Semester to related Course.")
	public void addSemester(@RequestBody SemesterDto semesterDto) {
		semesterService.addSemester(semesterDto);
	}
}
