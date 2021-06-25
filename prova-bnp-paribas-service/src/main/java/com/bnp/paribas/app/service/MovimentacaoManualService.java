package com.bnp.paribas.app.service;


import java.util.List;

import com.bnp.paribas.app.model.MovimentacaoManual;

public interface MovimentacaoManualService {
	
	List<MovimentacaoManual> getAll();
	
	MovimentacaoManual save(MovimentacaoManual movimentacao);
	
	Integer getMaxLancamentoByMesAndAno(int dtMes, int dtAno);

}
