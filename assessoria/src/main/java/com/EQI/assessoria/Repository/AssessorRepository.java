package com.EQI.assessoria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EQI.assessoria.Model.Assessor;

@Repository
public interface AssessorRepository extends JpaRepository<Assessor, Long> {
	public List<Assessor> findAllByNomeContainingIgnoreCase(String nome);
	
	
}
