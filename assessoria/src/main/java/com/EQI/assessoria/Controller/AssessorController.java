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

import com.EQI.assessoria.Model.Assessor;
import com.EQI.assessoria.Repository.AssessorRepository;

@RestController
@RequestMapping("/assessor")
@CrossOrigin("*")
public class AssessorController {
	
	@Autowired
	private AssessorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Assessor>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}

	@PostMapping
	public ResponseEntity<Assessor> post (@RequestBody Assessor assessor){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(assessor));
	}
}
