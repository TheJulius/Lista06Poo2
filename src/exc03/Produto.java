package exc03;

public class Produto {
	
	private int id;
	private String nome;
	private String tamanho;
	
	
	
	public Produto(int id, String nome, String tamanho) {
		super();
		setId(id);
		setNome(nome);
		setTamanho(tamanho);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
