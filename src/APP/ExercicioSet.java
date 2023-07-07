package APP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> palavras = new HashSet<>();

		System.out.println("Digite uma frase: ");
		String[] frase = sc.nextLine().split(" ");

		for (String palavra : frase) {
			palavras.add(palavra);
		}

		int numPalavrasUnicas = palavras.size();
		System.out.println("Número de palavras não repetidas na frase: " + numPalavrasUnicas);
		List<String> lista = new ArrayList<>();
		lista.addAll(palavras);
		for(String listar : lista) {
			System.out.print(" "+listar);
		}
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		

		sc.close();
	}

}
