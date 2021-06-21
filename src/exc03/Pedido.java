package exc03;

import java.util.List;

public class Pedido {
	
	private List<Produto> listaDeProdutos;

	public Pedido(List<Produto> listaDeProdutos) {
		super();
		this.listaDeProdutos = listaDeProdutos;
	}

	public boolean addProduto(Produto produto) {
		listaDeProdutos.add(produto);
		return true;
	}
	
	public List<Produto> mostraLista() {
		return listaDeProdutos;
		
	}

}
