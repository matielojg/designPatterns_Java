package br.com.matielo.produto;

import java.math.BigDecimal;

import br.com.matielo.produto.desconto.CalculadoraDeDescontos;
import br.com.matielo.produto.orcamento.Orcamento;

public class TesteDescontos_TemplateMethod {
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));

	}
}