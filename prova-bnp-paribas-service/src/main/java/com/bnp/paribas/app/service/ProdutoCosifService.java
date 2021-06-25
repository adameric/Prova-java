package com.bnp.paribas.app.service;


import java.util.List;

import com.bnp.paribas.app.model.ProdutoCosif;

public interface ProdutoCosifService {
	
	List<ProdutoCosif> getAll();
	
	List<ProdutoCosif> findAllByCodProduto(String codProduto);

}
