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
import com.EQI.assessoria.Model.FundosDisponiveis;
import com.EQI.assessoria.Repository.FundosDisponiveisRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/fundos")
public class FundosDisponiveisController {
	@Autowired
	private FundosDisponiveisRepository repository;
	
	//Metodo que tras todos os fundos
	@GetMapping
	public ResponseEntity<List<FundosDisponiveis>> listarTodos(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	// Meotodo para popular a tabela FundosDisponiveis
	@PostMapping
	public ResponseEntity<FundosDisponiveis> CriarFundo (@RequestBody FundosDisponiveis fundos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(fundos));
	}
}
