package com.SIS.StudentInformationSystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {

	public String createdBy;

	public LocalDateTime createdOn;

	public String updatedBy;

	public LocalDateTime updatedOn;
	
}
