package com.SIS.StudentInformationSystem.model.mapping;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "semester_subject_map")
public class SemesterSubjectMap extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// Semester
	private Integer semester;

	// List<Subject>
	// private Integer subject;

	@Enumerated(EnumType.STRING)
	private Status status;
}
