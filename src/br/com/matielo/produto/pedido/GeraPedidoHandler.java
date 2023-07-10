package br.com.matielo.produto.pedido;

import java.time.LocalDateTime;

import br.com.matielo.produto.orcamento.Orcamento;
import br.com.matielo.produto.pedido.acao.EnviarEmailPedido;
import br.com.matielo.produto.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		EnviarEmailPedido email = new EnviarEmailPedido();
		SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

		email.executar(pedido);
		salvar.executar(pedido);
	}
}
