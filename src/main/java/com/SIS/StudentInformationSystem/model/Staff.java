package com.SIS.StudentInformationSystem.model;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.master.MasterStaffDesignation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "staff")
public class Staff extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String fatherSpouseName;

	@Lob
	private byte[] photo;

	@Lob
	private byte[] sign;

	private Integer contact;

	private String email;

	private String nationality;

	private String address;

	private String pinCode;

	private String city;

	private Integer stateId;

	private String country;

	@ManyToOne
	@JoinColumn(name = "master_staff_designation")
	private MasterStaffDesignation designation;

	@Enumerated(EnumType.STRING)
	private Status status;
}
