package com.example.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compras") // create tabela
public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // incremento
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;

	@ManyToOne
	@JoinColumn(name = "cliente_id") // chave estrangeira
	private Cliente cliente;// relacionadas a um cliente

	public Compras() {

	}

	public Compras(int id, Double totalCompra, LocalDate dataCompra, Cliente cliente) {
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
		this.cliente = cliente;
	}
	
	public Compras(int id) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
