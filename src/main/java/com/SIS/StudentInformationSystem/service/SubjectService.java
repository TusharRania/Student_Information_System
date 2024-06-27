package com.SIS.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SIS.StudentInformationSystem.dto.SubjectDto;
import com.SIS.StudentInformationSystem.model.Semester;
import com.SIS.StudentInformationSystem.model.Subject;
import com.SIS.StudentInformationSystem.repository.SemesterRepo;
import com.SIS.StudentInformationSystem.repository.SubjectRepo;
import com.SIS.StudentInformationSystem.response.SubjectResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubjectService {
	private SubjectRepo subjectRepo;

	private SemesterRepo semesterRepo;

	public SubjectResponse addSubject(SubjectDto subjectDto) {
		Semester semester = semesterRepo.findByCourseIdAndSemesterId(subjectDto.getCourseId(),
				subjectDto.getSemesterId());
		System.out.println(
				semester.getId() + " " + semester.getCourse().getName() + " " + semester.getSemester().getName());

		Subject subject = new Subject();
		subject.setName(subjectDto.getSubject());
		subject.setSemester(semester);
		subject.setStatus(subjectDto.getStatus());
		subject.setOptional(subjectDto.isOptional());
		subject.setSubjectType(subjectDto.getSubjectType());

		subjectRepo.save(subject);

		SubjectResponse response = subjectResponse(subject);

		return response;
	}

	private SubjectResponse subjectResponse(Subject subject) {
		SubjectResponse response = new SubjectResponse();
		response.setId(subject.getId());
		response.setSubject(subject.getName());
		response.setCourse(subject.getSemester().getCourse().getName());
		response.setSemester(subject.getSemester().getSemester().getName());
		response.setSubjectType(subject.getSubjectType());
		response.setStatus(subject.getStatus());
		return response;
	}

	public List<SubjectResponse> getSubject() {
		List<SubjectResponse> subResponse = new ArrayList<>();
		List<Subject> subject = subjectRepo.findAll();
		for (Subject sub : subject) {
//			SubjectResponse response = new SubjectResponse();
//			response.setId(sub.getId());
//			response.setSubject(sub.getName());
//			response.setCourse(sub.getSemester().getCourse().getName());
//			response.setSemester(sub.getSemester().getSemester().getName());
//			response.setSubjectType(sub.getSubjectType());
//			response.setStatus(sub.getStatus());
//			subjectResponse.add(response);
			
			SubjectResponse response = subjectResponse(sub);
			subResponse.add(response);
		}
		return subResponse;
	}
}
