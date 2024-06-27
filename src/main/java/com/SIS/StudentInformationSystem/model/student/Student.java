package com.SIS.StudentInformationSystem.model.student;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Caste;
import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.Course;
import com.SIS.StudentInformationSystem.model.OpenElectiveSubject;
import com.SIS.StudentInformationSystem.model.Semester;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String applicationNo;

	private String registrationNo;

	private String rollNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course", nullable = false)
	private Course course;

	@ManyToOne
	@JoinColumn(name = "semester", nullable = false)
	private Semester semester;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	// @JoinColumn(name = "StudentOptionalSubjectMap")
	private List<StudentOptionalSubjectMap> optionalSubject;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	private List<PreviousEducation> previousEducation;

	@ManyToOne
	@JoinColumn(name = "openElectiveSubject")
	private OpenElectiveSubject openElectiveSubject;

	private String name;

	private String gender;

	private String dob;

	private String religion;

	@Enumerated(EnumType.STRING)
	private Caste caste;

	private String maritalStatus;

	private boolean isMinority;

	@OneToOne(cascade = CascadeType.ALL)
	private StudentAddress address;

	@OneToOne(cascade = CascadeType.ALL)
	private Parent parent;

	@OneToOne(cascade = CascadeType.ALL)
	private StudentContact contact;

	@Enumerated(EnumType.STRING)
	private Status status;

}
