package com.SIS.StudentInformationSystem.service;

import org.springframework.stereotype.Service;

import com.SIS.StudentInformationSystem.repository.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
 
	private StudentRepo studentRepo;
	
}
