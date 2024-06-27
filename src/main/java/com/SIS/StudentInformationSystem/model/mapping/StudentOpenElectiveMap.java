package com.SIS.StudentInformationSystem.model.mapping;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.master.MasterOpenElective;
import com.SIS.StudentInformationSystem.model.student.Student;

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
@Table(name = "student_open_elective_map")
public class StudentOpenElectiveMap extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// Student
	private Integer student;

	// MasterOpenElective
	private Integer openElective;

	@Enumerated(EnumType.STRING)
	private Status status;
}
