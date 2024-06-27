package com.SIS.StudentInformationSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SIS.StudentInformationSystem.dto.SubjectDto;
import com.SIS.StudentInformationSystem.response.SubjectResponse;
import com.SIS.StudentInformationSystem.service.SubjectService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Tag(name = "Subject Controller", description = "Rest Controller for APIs related to Subjects.")
public class SubjectController {

	private SubjectService subjectService;

	@PostMapping("/addSubject")
	@Operation(description = "Adding Subject to Related Course & Semester.")
	public SubjectResponse addSubject(@RequestBody SubjectDto subject) {
		return subjectService.addSubject(subject);
	}

	@GetMapping("/getSubject")
	@Operation(description = "Getting List of Subjects.")
	public List<SubjectResponse> getSubject() {
		return subjectService.getSubject();
	}
}
