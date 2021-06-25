package com.bnp.paribas.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@Data
@Embeddable
public class ProdutoCosifPK implements Serializable {
	
	private static final long serialVersionUID = -6610161973818739325L;

    @Column(name = "COD_PRODUTO",length = 4, nullable = false)
    private String codProduto;
    
    @Column(name = "COD_COSIF",length = 11, nullable = false)
    private String codCosif;
	
	public ProdutoCosifPK(String codProduto,String codCosif) {
		this.codCosif = codCosif;
		this.codProduto = codProduto;
	}
	
	public ProdutoCosifPK() {
	}
	
}
