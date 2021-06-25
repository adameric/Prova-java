package com.bnp.paribas.app.model.resquest;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class MovimentacaoManualDTO {
	
	private MovimentacaoManualPKDTO id;
    private String descricao;
    private String valor;

}
