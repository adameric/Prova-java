package com.bnp.paribas.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.service.ProdutoCosifService;
import com.bnp.paribas.app.utils.ResponseUtil;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/produtocosif")
public class ProdutoCosifController {

    @Autowired
    private ProdutoCosifService service;

    @GetMapping
    @Operation(summary  = "Obter todos os Produtos do Plano Contábil das Instituições do Sistema Financeiro ")
    public  ResponseEntity<List<?>> getAllProdutosCosif() {
        List<?> list = service.getAll();
        return ResponseEntity.ok().body(list);
    }
    
    @SuppressWarnings("unchecked")
	@GetMapping("/{codProduto}")
    @Operation(summary  = "Obter todos os Produtos COSIF filtrado por codProduto ")
    public ResponseEntity<List<?>> getAllProdutosCosifByCodProduto(@PathVariable String codProduto) {
    	List<?> list = service.findAllByCodProduto(codProduto);
    	return ResponseEntity.ok().body(ResponseUtil.parseProdutoCosifResponse((List<ProdutoCosif>) list));
    }
    

}

