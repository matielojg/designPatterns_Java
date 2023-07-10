package br.com.matielo.produto.orcamento.situacao;

import br.com.matielo.produto.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
