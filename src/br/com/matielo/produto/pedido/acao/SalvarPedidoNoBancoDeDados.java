package br.com.matielo.produto.pedido.acao;

import br.com.matielo.produto.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}
}
