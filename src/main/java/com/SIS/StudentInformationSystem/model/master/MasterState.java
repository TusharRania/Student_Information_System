package com.SIS.StudentInformationSystem.model.master;

import java.util.List;

import com.SIS.StudentInformationSystem.enumeration.Status;
import com.SIS.StudentInformationSystem.model.Base;
import com.SIS.StudentInformationSystem.model.student.StudentAddress;

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
@Table(name = "master_state")
public class MasterState extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "state")
	private List<StudentAddress> studentAddress;

	@Enumerated(EnumType.STRING)
	private Status status;

}
