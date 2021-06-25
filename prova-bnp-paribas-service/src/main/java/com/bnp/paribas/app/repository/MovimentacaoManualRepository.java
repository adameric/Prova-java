package com.bnp.paribas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bnp.paribas.app.model.MovimentacaoManual;
import com.bnp.paribas.app.model.MovimentacaoManualPK;

@Repository
public interface MovimentacaoManualRepository extends JpaRepository<MovimentacaoManual, MovimentacaoManualPK> {
	@Query("select max(u.id.numLancamento) from MovimentacaoManual u where u.id.dtMes = ?1 and u.id.dtAno = ?2")
	Integer getMaxLancamentoByMesAndAno(int dtMes, int dtAno);
}
