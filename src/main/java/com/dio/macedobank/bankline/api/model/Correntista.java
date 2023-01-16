package com.dio.macedobank.bankline.api.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private Integer id;
	
	@Getter @Setter
	@Column(length = 20)
	private String cpf;
	
	@Column(length = 60)
	@Getter @Setter
	private String nome;
	
	@Embedded
	@Getter @Setter
	private Conta conta;
}
