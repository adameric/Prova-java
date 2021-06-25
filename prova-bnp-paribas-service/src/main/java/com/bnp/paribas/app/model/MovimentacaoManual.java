package com.bnp.paribas.app.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="MOVIMENTACAO_MANUAL")
public class MovimentacaoManual implements Serializable {

	private static final long serialVersionUID = 4617691050286785926L;

	@EmbeddedId
	private MovimentacaoManualPK id;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumns({
      @JoinColumn(name = "COD_COSIF", referencedColumnName = "COD_COSIF",insertable = false, updatable = false),
      @JoinColumn(name = "COD_PRODUTO",referencedColumnName = "COD_PRODUTO", insertable = false, updatable = false)
    })
    private ProdutoCosif produtoCosif;
	
    @Column(name = "DES_DESCRICAO",nullable=false, length=50)
    private String descricao;
    
    @Column(name = "COD_USUARIO",nullable=false, length=15)
    private String codUsuario;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_MOVIMENTO")
    private Date dataMovimento;
    
    @Column(name = "VAL_VALOR" , precision = 18, scale = 2)
    private float valor;
    
}