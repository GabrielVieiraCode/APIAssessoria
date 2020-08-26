package com.EQI.assessoria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EQI.assessoria.Model.FundosDisponiveis;

@Repository
public interface FundosDisponiveisRepository extends JpaRepository<FundosDisponiveis, Long> {
	
}
