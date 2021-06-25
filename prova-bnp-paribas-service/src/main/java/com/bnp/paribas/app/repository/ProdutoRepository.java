package com.bnp.paribas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnp.paribas.app.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
