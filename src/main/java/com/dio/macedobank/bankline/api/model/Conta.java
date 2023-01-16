package com.dio.macedobank.bankline.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Conta {
	
	@Column(name = "conta_numero")
	@Getter @Setter
	private Long numero;
	
	@Column(name = "conta_saldo")
	@Getter 
	private Double saldo;
	
	

}
