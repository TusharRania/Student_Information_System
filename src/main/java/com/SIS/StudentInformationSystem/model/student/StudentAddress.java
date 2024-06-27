package com.SIS.StudentInformationSystem.model.student;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.master.MasterState;

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
@Table(name = "student_address")
public class StudentAddress extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String address;

	private String pinCode;

	private String city;

	@ManyToOne
	@JoinColumn(name = "master_state", nullable = false)
	private MasterState state;

	private String country;

	@Enumerated(EnumType.STRING)
	private Status status;

}
