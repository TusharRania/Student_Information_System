package com.SIS.StudentInformationSystem.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.SIS.StudentInformationSystem.model.master.MasterSemester;

public interface MasterSemesterRepo extends JpaRepository<MasterSemester, Integer> {

//	@Query("SELECT e FROM MasterSemester e ORDER BY e.id DESC")
	List<MasterSemester> findTopByOrderByIdAsc(Pageable pageRequest);
}
