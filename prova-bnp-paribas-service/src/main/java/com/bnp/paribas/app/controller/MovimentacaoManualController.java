package com.bnp.paribas.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.paribas.app.model.MovimentacaoManual;
import com.bnp.paribas.app.model.resquest.MovimentacaoManualfRequest;
import com.bnp.paribas.app.service.MovimentacaoManualService;
import com.bnp.paribas.app.utils.ResponseUtil;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/movimentacao")
@CrossOrigin(origins = "*")
public class MovimentacaoManualController {

    @Autowired
    private MovimentacaoManualService service;

    @SuppressWarnings("unchecked")
	@GetMapping
    @Operation(summary  = "Obter todas as Movimentações Manuais")
    public ResponseEntity<List<?>> getAll() {
        List<?> list = service.getAll();
        return ResponseEntity.ok().body(ResponseUtil.parseMovimentacaoManualfResponse((List<MovimentacaoManual>) list));
    }
    
    @PostMapping
    @Operation(summary  = "Salvar Movimentações Manuais")
    public ResponseEntity<?> save(@RequestBody MovimentacaoManualfRequest movimentacaoRequest) {
        MovimentacaoManual savedMovimentacao= service.save(ResponseUtil.parseMovimentacaoManualfResponseToModel(movimentacaoRequest));
        return ResponseEntity.ok().body(savedMovimentacao);
    }

}

