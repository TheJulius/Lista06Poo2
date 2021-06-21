package exc03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Produto a = new Produto(1, "nome criativo", "medio");
		Produto b = new Produto(2, "nome realmente criativo", "grande");
		List<Produto> lista = new ArrayList<Produto>();
		Pedido c = new Pedido(lista);
		
		System.out.println(c.addProduto(a));
		System.out.println(c.addProduto(b));
		
		for(int i=0;i<c.mostraLista().size();i++){
		    System.out.println(c.mostraLista().get(i));
		} 
		


	}

}
