package br.com.matielo.
produto;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.matielo.produto.pedido.GeraPedido;
import br.com.matielo.produto.pedido.GeraPedidoHandler;
import br.com.matielo.produto.pedido.acao.EnviarEmailPedido;
import br.com.matielo.produto.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos_PatternObserver {

	public static void main(String[] args) {
		String cliente = "Matielo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
						new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido()
						));
		handler.execute(gerador);
	}
}
