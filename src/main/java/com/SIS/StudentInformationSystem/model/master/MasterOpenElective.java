package com.SIS.StudentInformationSystem.model.master;

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
@Table(name = "master_open_elective")
public class MasterOpenElective extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// MasterDepartment
	private Integer deptId;

	// MasterCourseType
	private Integer courseType;

	// MasterSemester
	private Integer semester;

	private String name;

	@Enumerated(EnumType.STRING)
	private Status status;
}
