package com.bnp.paribas.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.paribas.app.service.ProdutoService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    @Operation(summary  = "Obter todos os Produtos")
    public ResponseEntity<List<?>> getAllProdutos() {
        List<?> list = service.getAll();
        return ResponseEntity.ok().body(list);
    }

}

