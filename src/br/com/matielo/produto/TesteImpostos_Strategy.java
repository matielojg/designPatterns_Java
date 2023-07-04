package br.com.matielo.produto;

import java.math.BigDecimal;

import br.com.matielo.produto.imposto.CalculadoraDeImpostos;
import br.com.matielo.produto.imposto.ICMS;
import br.com.matielo.produto.imposto.ISS;
import br.com.matielo.produto.orcamento.Orcamento;

public class TesteImpostos_Strategy {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}
}