package exc02;

import java.util.Date;

public class Produto<T>{
	
	private T id ;
	private static double valor ;
	private static Date dataFabricacao;
	private static Date dataVencimento;
	
	
	
	public Produto(T id) {
		super();
		setId(id);
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public static double getValor() {
		return valor;
	}
	public static void setValor(double valor) {
		Produto.valor = valor;
	}
	public static Date getDataFabricacao() {
		return dataFabricacao;
	}
	public static void setDataFabricacao(Date dataFabricacao) {
		Produto.dataFabricacao = dataFabricacao;
	}
	public static Date getDataVencimento() {
		return dataVencimento;
	}
	public static void setDataVencimento(Date dataVencimento) {
		Produto.dataVencimento = dataVencimento;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	
}
