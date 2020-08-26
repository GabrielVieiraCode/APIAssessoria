package com.EQI.assessoria.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_Proposta")
public class Proposta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private float valor;
	
	private boolean pagamento;
	
	@ManyToOne
	@JsonIgnoreProperties("proposta")
	private FundosDisponiveis fundo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	public FundosDisponiveis getFundo() {
		return fundo;
	}

	public void setFundo(FundosDisponiveis fundo) {
		this.fundo = fundo;
	}
	
	
	
	
}
