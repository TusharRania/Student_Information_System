package com.SIS.StudentInformationSystem.model.student;

import java.time.LocalDate;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.master.MasterCourseType;

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
@Table(name = "previous_education")
public class PreviousEducation extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "student")
	private Student student;

	private Integer courseTypeId;

	private String courseName;

	private long obtMarks;

	private long totalMarks;

	private LocalDate start;

	private LocalDate end;

	private String passingYear;

	private String certifyingInstituteName;

	private Integer certifyingStateId;

	private Integer certifyingBoardId;

	@Enumerated(EnumType.STRING)
	private Status status;

}