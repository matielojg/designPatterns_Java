package br.com.matielo.produto.desconto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular(Orcamento orcamento);
}
