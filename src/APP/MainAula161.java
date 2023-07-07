package APP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class MainAula161 {

	public static void main(String[] args) {
		List<Funcionario> salario = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("É um funcionário terceirizado? (Y/N)");
			String resposta = (scanner.next()).toLowerCase();
			if (resposta.equals("n")) {
				System.out.println("Digite o nome do funcionário");
				String nome = scanner.next();
				System.out.println("Digite as horas trabalhadas");
				int hora = scanner.nextInt();
				System.out.println("Digite o valor da hora");
				Double valor_hora = scanner.nextDouble();
				Funcionario funcionario = new Funcionario(nome, hora, valor_hora);
				salario.add(funcionario);
			}
			if (resposta.equals("y")) {
				System.out.println("Digite o nome do funcionário");
				String nome = scanner.next();
				System.out.println("Digite as horas trabalhadas");
				int hora = scanner.nextInt();
				System.out.println("Digite o valor da hora");
				Double valor_hora = scanner.nextDouble();
				System.out.println("Digite o valor das despesas extras");
				Double valor_despesas = scanner.nextDouble();
				Funcionario funcionario = new FuncionarioTerceirizado(nome, hora, valor_hora, valor_despesas);
				salario.add(funcionario);
			}
		}
		System.out.println("=====PAGAMENTOS=====");
		for (int i = 0; i < salario.size(); i++) {
			Funcionario funcionario = salario.get(i);
			System.out.printf("O salário do funcionário %s é: %.2f.\n", funcionario.getNome(), funcionario.pagamento());
		}
		for (Funcionario funcionario : salario) { //PARA CADA COISA(EMPREGADO) NA LISTA SALARIO EU FAÇO
			System.out.printf("O salário do funcionário %s é: %.2f.\n", funcionario.getNome(), funcionario.pagamento());
		}

		scanner.close();
	}

}
