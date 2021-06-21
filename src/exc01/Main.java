package exc01;

public class Main {

	public static void main(String[] args) {
		ClasseGenerica<String> teste = new ClasseGenerica<>();
		teste.set("Julio Cesar");
		
		ClasseGenerica<Integer> teste1 = new ClasseGenerica<>();
		teste1.set(20);
		
		ClasseGenerica<Cone> teste2 = new ClasseGenerica<>();
		teste2.set(null);
		

	}

}
