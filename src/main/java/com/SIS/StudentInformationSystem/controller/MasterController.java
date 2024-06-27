package com.SIS.StudentInformationSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SIS.StudentInformationSystem.model.master.MasterCourseType;
import com.SIS.StudentInformationSystem.service.MasterService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/master")
@Tag(name = "Course-Type Controller", description = "Rest Controller for APIs related to Master Data of Course Type.")
public class MasterController {

	private MasterService masterService;

	@PostMapping("/addCourseType")
	@Operation(description = "Adding Course Type.")
	public String addCourseType(@RequestBody MasterCourseType masterCourseType) {
		return masterService.addCourseType(masterCourseType);
	}

	@GetMapping("/courseTypes")
	@Operation(description = "Getting Course Type.")
	public List<MasterCourseType> courseType() {
		return masterService.getAllCourseType();
	}
}
