package com.bnp.paribas.app.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovimentacaoManualResponse {
	
	    private int dtMes;
	    private int dtAno;
	    private int numLancamento;
	    private String codProduto;
	    private String codCosif;
	    private String descricao;
	    private float valor;
	    private String descricaoProduto;
	    private String codUsuario;

}
