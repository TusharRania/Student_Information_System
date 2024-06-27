package com.SIS.StudentInformationSystem.model.mapping;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.OpenElectiveSubject;
import com.SIS.StudentInformationSystem.model.master.MasterDepartment;
import com.SIS.StudentInformationSystem.model.master.MasterSemester;

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
@Table(name = "department_semester_map")
public class DepartmentSemesterMap extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "department", nullable = false)
	private MasterDepartment department;

	@ManyToOne
	@JoinColumn(name = "semester")
	private MasterSemester semester;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "semester")
	private List<OpenElectiveSubject> subject;

	@Enumerated(EnumType.STRING)
	private Status status;
}
