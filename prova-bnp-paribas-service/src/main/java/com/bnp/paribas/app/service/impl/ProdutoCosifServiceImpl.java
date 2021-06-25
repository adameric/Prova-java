package com.bnp.paribas.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.repository.ProdutoCosifRepository;
import com.bnp.paribas.app.service.ProdutoCosifService;

@Service
public class ProdutoCosifServiceImpl implements ProdutoCosifService {
	

	@Autowired
	private ProdutoCosifRepository repository;
	
	@Override
	public List<ProdutoCosif> getAll() {
		return repository.findAll();
	}

	@Override
	public List<ProdutoCosif> findAllByCodProduto(String codProduto) {
		return repository.findAllByCodProduto(codProduto);
	}
	

}
