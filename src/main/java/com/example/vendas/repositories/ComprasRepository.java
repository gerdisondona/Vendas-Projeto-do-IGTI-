package com.example.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.vendas.DTO.RankingComprasDTO;
import com.example.vendas.entities.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Integer>{

	@Query("SELECT new com.example.vendas.DTO.RankingComprasDTO(compras.cliente, SUM(compras.totalCompra))"
		+ "FROM Compras AS compras GROUP BY compras.cliente")
	List<RankingComprasDTO>findRanking();
}
