package com.dio.macedobank.bankline.api.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Movimentacao {
	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
}
