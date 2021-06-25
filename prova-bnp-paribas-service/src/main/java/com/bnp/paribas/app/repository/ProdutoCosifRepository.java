package com.bnp.paribas.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.model.ProdutoCosifPK;

@Repository
public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, ProdutoCosifPK> {
	
	@Query("select u from ProdutoCosif u where u.produto.id = ?1")
	List<ProdutoCosif> findAllByCodProduto(String codProduto);
}
