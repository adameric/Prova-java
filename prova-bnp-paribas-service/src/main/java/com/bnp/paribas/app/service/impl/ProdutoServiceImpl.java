package com.bnp.paribas.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.paribas.app.model.Produto;
import com.bnp.paribas.app.repository.ProdutoRepository;
import com.bnp.paribas.app.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	

	@Autowired
	private ProdutoRepository repository;
	

	
	@Override
	public List<Produto> getAll() {
		return repository.findAll();
	}
	


}
