package com.SIS.StudentInformationSystem.model.student;

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
@Table(name = "parent")
public class Parent extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String fatherName;

	private String fatherOccupation;

	private Integer fatherIncome;

	private String motherName;

	private String motherOccupation;

	private Integer motherIncome;

	private String guardianName;

	private String guardianOccupation;

	private Integer guardianIncome;

	private String contact;

	private String email;

	@Enumerated(EnumType.STRING)
	private Status status;

}
