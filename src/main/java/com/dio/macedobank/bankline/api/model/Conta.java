package com.dio.macedobank.bankline.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Conta {

	@Column(name = "conta_numero")
	private Long numero;

	@Column(name = "conta_saldo")
	private Double saldo;

}
