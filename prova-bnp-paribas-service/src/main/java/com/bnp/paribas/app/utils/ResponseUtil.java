package com.bnp.paribas.app.utils;

import java.util.ArrayList;
import java.util.List;

import com.bnp.paribas.app.model.MovimentacaoManual;
import com.bnp.paribas.app.model.MovimentacaoManualPK;
import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.model.response.MovimentacaoManualResponse;
import com.bnp.paribas.app.model.response.ProdutoCosifResponse;
import com.bnp.paribas.app.model.resquest.MovimentacaoManualfRequest;

public class ResponseUtil {
	
	public static List<ProdutoCosifResponse> parseProdutoCosifResponse(List<ProdutoCosif> list) {
		
		List<ProdutoCosifResponse> responseList = new ArrayList<ProdutoCosifResponse>();
		
		for(ProdutoCosif prod : list) {
			ProdutoCosifResponse response = ProdutoCosifResponse.builder()
						   		.codProduto(prod.getId().getCodProduto())
						   		.codCosif(prod.getId().getCodCosif())
						   		.codClassificao(prod.getCodClassificao())
						   	.build();
			responseList.add(response);			  
		}
		return responseList;
	}
	
	public static List<MovimentacaoManualResponse> parseMovimentacaoManualfResponse(List<MovimentacaoManual> list) {
		
		List<MovimentacaoManualResponse> listDTO = new ArrayList<MovimentacaoManualResponse>();
		
		for(MovimentacaoManual mov : list) {
			MovimentacaoManualResponse mvtDTO = MovimentacaoManualResponse.builder()
									.codCosif(mov.getId().getCodCosif())
									.codProduto(mov.getId().getCodProduto())
									.descricao(mov.getDescricao())
									.descricaoProduto(mov.getProdutoCosif().getProduto().getDescricao())
									.dtAno(mov.getId().getDtAno())
									.dtMes(mov.getId().getDtMes())
									.codUsuario(mov.getCodUsuario())
									.numLancamento(mov.getId().getNumLancamento())
									.valor(mov.getValor())
								.build();
			listDTO.add(mvtDTO);			  
		}
		return listDTO;
	}
	
	@SuppressWarnings("static-access")
	public static MovimentacaoManual parseMovimentacaoManualfResponseToModel(MovimentacaoManualfRequest movimentacao) {
		MovimentacaoManualPK pk = new MovimentacaoManualPK().builder()
								.codCosif(movimentacao.getCodCosif())
								.codProduto(movimentacao.getCodProduto())
								.dtAno(movimentacao.getDtAno())
								.dtMes(movimentacao.getDtMes())
							.build();
		
		MovimentacaoManual mvt = new MovimentacaoManual().builder()
							   .id(pk)
							   .descricao(movimentacao.getDescricao())
							   .valor(movimentacao.getValor())
							.build();
		return mvt;
	}
}
