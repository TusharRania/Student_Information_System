package com.SIS.StudentInformationSystem.model.master;

import java.util.List;

import org.hibernate.annotations.Where;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.Course;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "master_course_type")
public class MasterCourseType extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String courseType;
//	, orphanRemoval = true
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "courseType")
	private List<Course> course;

	@Enumerated(EnumType.STRING)
	private Status status;

}
