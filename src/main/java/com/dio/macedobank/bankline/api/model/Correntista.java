package com.dio.macedobank.bankline.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Correntista {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String cpf;
	@Getter @Setter
	private String nome;
	@Getter @Setter
	private Conta conta;
}
