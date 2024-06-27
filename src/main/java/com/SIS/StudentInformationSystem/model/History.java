package com.SIS.StudentInformationSystem.model;

import com.SIS.StudentInformationSystem.model.student.Student;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


//@Entity
@Data
//@Table(name = "history")
public class History {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Student student;
	
}
