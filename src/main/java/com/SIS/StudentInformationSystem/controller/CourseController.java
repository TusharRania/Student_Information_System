package com.SIS.StudentInformationSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SIS.StudentInformationSystem.dto.CourseDto;
import com.SIS.StudentInformationSystem.dto.CourseDtoV2;
import com.SIS.StudentInformationSystem.response.CourseResponse;
import com.SIS.StudentInformationSystem.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Tag(name = "Course Controller", description = "Rest Controller for APIs related to Course.")
public class CourseController {

	private CourseService courseService;

	@PostMapping("/addCourse")
	@Operation(description = "Adding Course.")
	public String addCourse(@RequestBody CourseDto courseDto) {
		return courseService.addCourse(courseDto);
	}

	@PostMapping("/addCourseV2")
	@Operation(description = "Adding Course using different method.")
	public String addCourseV2(@RequestBody CourseDtoV2 courseDtoV2) {
		return courseService.addCourseV2(courseDtoV2);
	}

	@GetMapping("/courses")
	@Operation(description = "Getting all Courses from Database.")
	public List<CourseResponse> courses() {
		return courseService.getCourses();
	}

	@PostMapping("/courses{id}")
	@Operation(description = "Getting a particular Cousre from its I'd.")
	public CourseResponse courses(Integer id) {
		return courseService.getCourseById(id);
	}
}
