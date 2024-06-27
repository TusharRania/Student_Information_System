package com.SIS.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SIS.StudentInformationSystem.dto.SemesterDto;
import com.SIS.StudentInformationSystem.model.Course;
import com.SIS.StudentInformationSystem.model.Semester;
import com.SIS.StudentInformationSystem.model.master.MasterSemester;
import com.SIS.StudentInformationSystem.repository.CourseRepo;
import com.SIS.StudentInformationSystem.repository.MasterSemesterRepo;
import com.SIS.StudentInformationSystem.repository.SemesterRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SemesterService {

	private SemesterRepo semesterRepo;

	private CourseRepo courseRepo;

	private MasterSemesterRepo masterSemesterRepo;

	public void addSemester(SemesterDto semesterDto) {

//		Optional<Course> course = courseRepo.findById(semesterDto.getCourseId());
//		  PageRequest pageRequest = PageRequest.of(0, semesterDto.getSemesterCount(), Sort.by("id").ascending());
//		List<MasterSemester> masterSemesterList = masterSemesterRepo
//				.findTopByOrderByIdAsc(pageRequest);
//
//		List<Semester> semesterList = new ArrayList<>();
//		for (MasterSemester masterSemester : masterSemesterList) {
//			Semester semester = new Semester();
//			semester.setCourse(course.get());
//			semester.setSemester(masterSemester);
//			semester.setStatus(semesterDto.getStatus());
//			semesterList.add(semester);
//		}
//		semesterRepo.saveAll(semesterList);

		Optional<Course> course = courseRepo.findById(semesterDto.getCourseId());
		List<Semester> semesterList = new ArrayList<>();

		for (Integer sem : semesterDto.getSemesterCount()) {
			Semester semester = new Semester();
			Optional<MasterSemester> masterSemester = masterSemesterRepo.findById(sem);
			semester.setCourse(course.get());
			semester.setSemester(masterSemester.get());
			semester.setStatus(semesterDto.getStatus());
			semesterList.add(semester);
		}
		semesterRepo.saveAll(semesterList);
	}

}
