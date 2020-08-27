package com.EQI.assessoria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//Metodo que tras todas as propostas
	@GetMapping
	public ResponseEntity<List<Proposta>> listarPropostas(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//Metodo para copular a tabela proposta 
	@PostMapping
	public ResponseEntity<Proposta> criarProposta (@RequestBody Proposta proposta){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(proposta));
	}
	
	//Metodo que puxa Proposta pelo id
	@GetMapping("/{id}")
	public ResponseEntity<Proposta> pegaPropostaId(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
				
	}
	
}
