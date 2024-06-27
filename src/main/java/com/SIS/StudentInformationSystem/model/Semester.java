package com.SIS.StudentInformationSystem.model;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.master.MasterDepartment;
import com.SIS.StudentInformationSystem.model.master.MasterSemester;
import com.SIS.StudentInformationSystem.model.student.Student;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "semester")
public class Semester extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "course", nullable = false)
	private Course course;

	@ManyToOne
	@JoinColumn(name = "semester")
	private MasterSemester semester;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "semester")
	private List<Subject> subject;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "semester")
	private List<Student> student;

	@Enumerated(EnumType.STRING)
	private Status status;

}
