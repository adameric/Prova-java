package com.bnp.paribas.app.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.bnp.paribas.app.model.Produto;
import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.model.ProdutoCosifPK;

public class MockUtil {

    private MockUtil() {
    }


    public static Supplier<List<Produto>> produtos= () ->
    Arrays.asList(
    		Produto.builder().descricao("DESC 001").status("A").codProduto("0001").build(),
    		Produto.builder().descricao("DESC 002").status("A").codProduto("0002").build(),
    		Produto.builder().descricao("DESC 003").status("A").codProduto("0003").build()
    );

    public static Supplier<List<ProdutoCosif>> produtosCosif= () ->
    
    Arrays.asList(
    		ProdutoCosif.builder().codClassificao("1000").id(new ProdutoCosifPK("0001","COD 1")).status("A").build(),
    		ProdutoCosif.builder().codClassificao("2000").id(new ProdutoCosifPK("0001","COD 2")).status("A").build(),
    		ProdutoCosif.builder().codClassificao("3000").id(new ProdutoCosifPK("0002","COD 3")).status("A").build(),
    		ProdutoCosif.builder().codClassificao("4000").id(new ProdutoCosifPK("0002","COD 4")).status("A").build(),
    		ProdutoCosif.builder().codClassificao("5000").id(new ProdutoCosifPK("0003","COD 5")).status("A").build(),
    		ProdutoCosif.builder().codClassificao("6000").id(new ProdutoCosifPK("0003","COD 6")).status("A").build()
    );
    
}
