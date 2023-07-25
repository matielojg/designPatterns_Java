package br.com.matielo.produto.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.matielo.produto.orcamento.Orcamento;
import br.com.matielo.produto.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a ->a.executarAcao(pedido));		
		
	}
}
