package com.bnp.paribas.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Data
@Embeddable
public class MovimentacaoManualPK implements Serializable {

	private static final long serialVersionUID = 3949411348284810040L;

	@Column(name = "DAT_MES",length = 2,nullable = false)
    private int dtMes;
    
    @Column(name = "DAT_ANO",length = 4,nullable = false)
    private int dtAno;
    
    @Column(name = "NUM_LANCAMENTO",length = 18,nullable = false)
    private int numLancamento;
    
    @Column(name = "COD_PRODUTO",length = 4, nullable = false)
    private String codProduto;
    
    @Column(name = "COD_COSIF",length = 11, nullable = false)
    private String codCosif;
    
}