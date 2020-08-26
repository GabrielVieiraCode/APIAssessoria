package com.EQI.assessoria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EQI.assessoria.Model.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {

}
