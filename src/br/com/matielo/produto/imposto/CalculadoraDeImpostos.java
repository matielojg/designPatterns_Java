package br.com.matielo.produto.imposto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

		return imposto.calcular(orcamento);
	}

}
