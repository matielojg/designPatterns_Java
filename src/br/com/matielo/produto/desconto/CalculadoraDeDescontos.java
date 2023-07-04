package br.com.matielo.produto.desconto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
		return desconto.calcular(orcamento);
	}
}
