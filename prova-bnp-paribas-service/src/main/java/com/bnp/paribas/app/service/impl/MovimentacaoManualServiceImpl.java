package com.bnp.paribas.app.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.paribas.app.model.MovimentacaoManual;
import com.bnp.paribas.app.repository.MovimentacaoManualRepository;
import com.bnp.paribas.app.service.MovimentacaoManualService;

@Service
public class MovimentacaoManualServiceImpl implements MovimentacaoManualService {
	

	@Autowired
	private MovimentacaoManualRepository repository;
	

	
	@Override
	public List<MovimentacaoManual> getAll() {
		return repository.findAll();
	}



	@Override
	public MovimentacaoManual save(MovimentacaoManual movimentacao) {
    	movimentacao.setDataMovimento(new Date());
    	Integer numLancamento= getMaxLancamentoByMesAndAno(movimentacao.getId().getDtMes(), movimentacao.getId().getDtAno());
    	movimentacao.getId().setNumLancamento(numLancamento);
    	movimentacao.setCodUsuario("TESTE");
		return repository.save(movimentacao);
	}

	@Override
	public Integer getMaxLancamentoByMesAndAno(int dtMes, int dtAno) {
		Integer numLancamento = repository.getMaxLancamentoByMesAndAno(dtMes, dtAno);
		return numLancamento==null?1:numLancamento+1;
	}
	


}
