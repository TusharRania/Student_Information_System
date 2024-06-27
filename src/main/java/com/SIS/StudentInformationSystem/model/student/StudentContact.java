package com.SIS.StudentInformationSystem.model.student;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.master.MasterCourseType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "student_contact")
public class StudentContact extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String contactNo;

	private String email;

	private String nationality;

	private Integer domicileId;

	@Lob
	private byte[] photo;

	@Lob
	private byte[] sign;

	@Enumerated(EnumType.STRING)
	private Status status;

}
