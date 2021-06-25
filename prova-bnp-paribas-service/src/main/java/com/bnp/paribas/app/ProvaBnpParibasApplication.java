package com.bnp.paribas.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bnp.paribas.app.model.Produto;
import com.bnp.paribas.app.model.ProdutoCosif;
import com.bnp.paribas.app.repository.ProdutoCosifRepository;
import com.bnp.paribas.app.repository.ProdutoRepository;
import com.bnp.paribas.app.utils.MockUtil;

@SpringBootApplication
@EnableJpaRepositories
@EnableEurekaClient
public class ProvaBnpParibasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaBnpParibasApplication.class, args);
	}

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoCosifRepository produtoCosifRepository;

	@Bean
	CommandLineRunner runner() {
		
		return args -> {
			List<Produto> produtos = produtoRepository.findAll();
			if (produtos.isEmpty()) {
				produtoRepository.saveAll(MockUtil.produtos.get());
			} 
			List<ProdutoCosif> produtoCosif = produtoCosifRepository.findAll();
			if (produtoCosif.isEmpty()) {
				produtoCosifRepository.saveAll(MockUtil.produtosCosif.get());
			} 
		};
	}

}
