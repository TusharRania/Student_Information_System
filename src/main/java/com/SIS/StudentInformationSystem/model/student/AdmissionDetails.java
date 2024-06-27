package com.SIS.StudentInformationSystem.model.student;

import java.time.LocalDate;

import com.SIS.StudentInformationSystem.enumeration.Caste;
import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.master.MasterCourseType;

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
@Table(name = "admission_details")
public class AdmissionDetails extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer studentId;

	private Integer courseId;

	@Enumerated(EnumType.STRING)
	private Caste admissionCaste;

	private LocalDate admissionDate;

	@Enumerated(EnumType.STRING)
	private Status status;

}
