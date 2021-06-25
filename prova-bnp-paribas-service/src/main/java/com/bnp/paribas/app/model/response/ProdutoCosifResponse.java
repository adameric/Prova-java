package com.bnp.paribas.app.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProdutoCosifResponse {

	private String codProduto;
    private String codCosif;
    private String codClassificao;
	    
}
