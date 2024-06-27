package com.SIS.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SIS.StudentInformationSystem.dto.CourseDto;
import com.SIS.StudentInformationSystem.dto.CourseDtoV2;
import com.SIS.StudentInformationSystem.model.Course;
import com.SIS.StudentInformationSystem.model.Semester;
import com.SIS.StudentInformationSystem.model.master.MasterCourseType;
import com.SIS.StudentInformationSystem.model.master.MasterSemester;
import com.SIS.StudentInformationSystem.repository.CourseRepo;
import com.SIS.StudentInformationSystem.repository.MasterSemesterRepo;
import com.SIS.StudentInformationSystem.repository.SemesterRepo;
import com.SIS.StudentInformationSystem.response.CourseResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {

	private CourseRepo courseRepo;

	private MasterCourseTypeRepo masterCourseTypeRepo;

	private MasterSemesterRepo masterSemesterRepo;

	private SemesterRepo semesterRepo;

	public String addCourse(CourseDto courseDto) {

		Course course = new Course();
		if (courseDto.getId() != null) {
			Optional<Course> oldCourse = courseRepo.findById(courseDto.getId());
			if (!oldCourse.isPresent()) {
				throw new RuntimeException("CourseId is Invalid.");
			}
			course = oldCourse.get();
		}
		course.setName(courseDto.getName());
		course.setSeats(courseDto.getSeats());
		course.setStatus(courseDto.getStatus());
		Optional<MasterCourseType> masterCourseType = masterCourseTypeRepo.findById(courseDto.getCourseTypeId());
		if (!masterCourseType.isPresent()) {
			throw new RuntimeException("Course Type is Invalid.");
		}
		course.setCourseType(masterCourseType.get());
		courseRepo.save(course);
		return "Course Added Sucessfully!" + course.getId();
	}

	public String addCourseV2(CourseDtoV2 courseDto) {

		Course course = new Course();
		if (courseDto.getId() != null) {
			Optional<Course> oldCourse = courseRepo.findById(courseDto.getId());
			if (!oldCourse.isPresent()) {
				throw new RuntimeException("CourseId is Invalid.");
			}
			course = oldCourse.get();
		}
		course.setName(courseDto.getName());
		course.setSeats(courseDto.getSeats());
		course.setStatus(courseDto.getStatus());
		Optional<MasterCourseType> masterCourseType = masterCourseTypeRepo.findById(courseDto.getCourseTypeId());
		
		if (!masterCourseType.isPresent()) {
			throw new RuntimeException("Course Type is Invalid.");
		}
		course.setCourseType(masterCourseType.get());
		courseRepo.save(course);

		List<Semester> semesterList = new ArrayList<>();

		for (Integer sem : courseDto.getSemester()) {
			Semester semester = new Semester();
			Optional<MasterSemester> masterSemester = masterSemesterRepo.findById(sem);
			semester.setCourse(course);
			semester.setSemester(masterSemester.get());
			semester.setStatus(courseDto.getStatus());
			semesterList.add(semester);
		}
		semesterRepo.saveAll(semesterList);

		return "Course Added Sucessfully!" + course.getId();
	}

	//Method to Get All Courses
	public List<CourseResponse> getCourses() {
		List<Course> course = courseRepo.findAll();
		List<CourseResponse> courseResponse = new ArrayList<>();
		for (Course crs : course) {
			CourseResponse res = new CourseResponse();
			getCourse(res, crs);
			courseResponse.add(res);
		}
		return courseResponse;
	}

	//Method to get Course by given Id.
	public CourseResponse getCourseById(Integer id) {
		CourseResponse courseResponse = new CourseResponse();
		Course course = courseRepo.findById(id).get();
		getCourse(courseResponse, course);
		return courseResponse;
	}

	
	//Common method to get & Fill response to use in both above methods. 
	private void getCourse(CourseResponse courseResponse, Course course) {
		courseResponse.setId(course.getId());
		courseResponse.setName(course.getName());
		courseResponse.setSeats(course.getSeats());
		courseResponse.setCourseType(course.getCourseType().getCourseType());
		courseResponse.setStatus(course.getStatus());
		List<String> sem = new ArrayList<>();
		for (Semester semester : course.getSemester()) {
			sem.add(semester.getSemester().getName());
		}
		courseResponse.setSemester(sem);
	}
}
