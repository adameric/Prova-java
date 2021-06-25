package com.bnp.paribas.app.model.resquest;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class MovimentacaoManualPKDTO {
	
    private int dtMes;
    private int dtAno;
    private String codProduto;
    private String codCosif;

}
