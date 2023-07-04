package br.com.matielo.produto.desconto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
