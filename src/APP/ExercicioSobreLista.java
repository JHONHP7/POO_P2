package APP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioSobreLista {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<String> frase = new ArrayList<>();
			System.out.println("Digite sua frase: ");
			String[] palavras = sc.nextLine().split(" ");
			for (String palavra : palavras) {
				frase.add(palavra);
			}

			System.out.println("A sua frase inversa é:");
			if (!frase.isEmpty()) {
				for (int i = frase.size() - 1; i >= 0; i--) {
					System.out.printf("%s ", frase.get(i));
				}
			} else {
				System.out.println("A frase está vazia.");
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}

}
