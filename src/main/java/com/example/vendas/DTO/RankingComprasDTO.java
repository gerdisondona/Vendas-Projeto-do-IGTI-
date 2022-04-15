package com.example.vendas.DTO;

import com.example.vendas.entities.Cliente;

public class RankingComprasDTO {

	private String nome;
	private Double valorTotal;

	public RankingComprasDTO() {

	}

	public RankingComprasDTO(Cliente cliente, Double valorTotal) {
		this.nome = cliente.getNome();
		this.valorTotal = valorTotal;
	}

	public String getNomeCliente() {
		return nome;
	}

	public void setNomeCliente(String nome) {
		this.nome = nome;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
