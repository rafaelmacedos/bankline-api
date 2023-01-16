package com.dio.macedobank.bankline.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tab_movimentacao")
@Getter @Setter
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	private String descricao;
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;
	
	@Column(name = "id_conta")
	private Integer idConta;
}
