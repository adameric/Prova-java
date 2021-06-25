package com.bnp.paribas.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="PRODUTO")
public class Produto implements Serializable {

	private static final long serialVersionUID = -7308073204377881561L;

	@Id
    @Column(name = "COD_PRODUTO",nullable=false,length=4)
    private String codProduto;
	
    @Column(name = "DES_PRODUTO",nullable=true, length=30)
    private String descricao;
    
    @Column(name = "STA_STATUS",nullable=true, length=1)
    private String status;
    
}