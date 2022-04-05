package com.example.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendas.DTO.ClienteDTO;
import com.example.vendas.entities.Cliente;
import com.example.vendas.service.ClienteService;

@RestController //classe ela vai ter endpoints
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<ClienteDTO> lista = clienteService.findAll();
		return ResponseEntity.ok(lista);
	}

}
