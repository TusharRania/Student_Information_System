package com.SIS.StudentInformationSystem.model.mapping;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.Subject;
import com.SIS.StudentInformationSystem.model.student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "student_optional_subject_map")
public class StudentOptionalSubjectMap extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "student")
	private Student student;

	@ManyToOne
	@JoinColumn(name = "subject")
	private Subject subject;

	@Enumerated(EnumType.STRING)
	private Status status;

}
