package APP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioSobreMap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();

		String[] palavras = frase.split(" ");

		Map<String, Integer> contagemPalavras = new HashMap<>();

		for (String palavra : palavras) {
			contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
		}
		for (String chave : contagemPalavras.keySet()) {//é um conjunto de chaves ou seja um SET
            Integer valor = contagemPalavras.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
		System.out.println(contagemPalavras);
	}

}
