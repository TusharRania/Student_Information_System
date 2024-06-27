package com.SIS.StudentInformationSystem.model;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.enumeration.SubjectType;
import com.SIS.StudentInformationSystem.model.mapping.StudentOptionalSubjectMap;

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
@Table(name = "subject")
public class Subject extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private boolean isOptional;

	@Enumerated(EnumType.STRING)
	private SubjectType subjectType;

	@ManyToOne
	@JoinColumn(name = "semester")
	private Semester semester;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "subject")
	private List<StudentOptionalSubjectMap> optionalSubject;

	@Enumerated(EnumType.STRING)
	private Status status;

}
