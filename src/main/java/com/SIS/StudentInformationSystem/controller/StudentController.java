package com.SIS.StudentInformationSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SIS.StudentInformationSystem.dto.StudentRegisterDto;
import com.SIS.StudentInformationSystem.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
@Tag(name = "Student Controller", description = "Rest Controller for APIs related to Students.")
public class StudentController {

	private StudentService studentService;

	@PostMapping("/register")
	@Operation(description = "Adding Student & Related Data.")
	public String registerStudent(@RequestBody StudentRegisterDto studentRegisterDto) {

		return "";
	}

}
