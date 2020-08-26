package com.EQI.assessoria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.EQI.assessoria.Model.Proposta;
import com.EQI.assessoria.Repository.PropostaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/proposta")
public class PropostaController {
	@Autowired
	private PropostaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Proposta>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@PostMapping
	public ResponseEntity<Proposta> post (@RequestBody Proposta proposta){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(proposta));
	}
	
	
}
