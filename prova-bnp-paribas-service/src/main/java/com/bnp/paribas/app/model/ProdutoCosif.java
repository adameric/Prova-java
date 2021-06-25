package com.bnp.paribas.app.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name="PRODUTO_COSIF")
public class ProdutoCosif implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ProdutoCosifPK id;
	
    @ManyToOne(cascade= { CascadeType.ALL})
    @JoinColumn(name="COD_PRODUTO", insertable = false, updatable = false)
    private Produto produto;

    @Column(name = "COD_CLASSIFICACAO",nullable=true, length=6)
    private String codClassificao;
    
    @Column(name = "STA_STATUS",nullable=true, length=1)
    private String status;
    
}