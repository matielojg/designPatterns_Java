package br.com.matielo.produto.pedido.acao;

import br.com.matielo.produto.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando emails com dados do pedido");
	}

}
