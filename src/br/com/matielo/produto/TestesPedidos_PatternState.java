package br.com.matielo.produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.matielo.produto.orcamento.Orcamento;
import br.com.matielo.produto.pedido.Pedido;

public class TestesPedidos_PatternState {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		String cliente = "Ana da Silva";
		LocalDateTime data = LocalDateTime.now();

		Pedido pedido = new Pedido(cliente, data, orcamento);
		System.out.println("Salvar pedido no BD" + pedido);
		System.out.println("Enviar email com dados do novo pedido");
	}
}
