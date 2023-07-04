package br.com.matielo.produto.imposto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));

	}
}
