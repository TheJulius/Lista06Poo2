package exc02;

public class Main {

	public static void main(String[] args) {
		
		Produto<String> teste = new Produto<>("id");
		System.out.println(teste);
		
		Produto<Integer> teste2 = new Produto<>(1);
		System.out.println(teste2);
	}

}
