package br.com.matielo.produto.imposto;

import java.math.BigDecimal;

import br.com.matielo.produto.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);

}
