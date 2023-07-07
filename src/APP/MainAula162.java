package APP;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ProdutoImportado;
import entities.ProdutoUsado;
import entities.Produtos;

public class MainAula162 {

	public static void main(String[] args) {
		List<Produtos> produto = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Produto comum, usado ou importado? (C/U/I)");
			char ch = scanner.next().charAt(0);
			System.out.println("Digite o nome do produto: ");
			String nome = scanner.next();
			System.out.println("Digite o valor do produto: ");
			Double preço = scanner.nextDouble();
			if (ch == 'c') {
				produto.add(new Produtos(nome, preço));
			} else if (ch == 'i') {
				System.out.println("Digite o valor da taxa: ");
				Double taxa = scanner.nextDouble();
				produto.add(new ProdutoImportado(nome, preço, taxa));
			} else {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				produto.add(new ProdutoUsado(nome, preço, date));
			}

		}
		for (Produtos produtos : produto) {
			System.out.println(produtos.priceTag());
		}
		scanner.close();
	}

}
