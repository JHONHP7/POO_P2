package CorrecaoExcecoes;

import java.util.Scanner;

public class Questao_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            String input = scanner.nextLine();
            
            // Lança uma exceção NumberFormatException se a entrada não for um número válido
            int numero = Integer.parseInt(input);

            // Lança uma exceção IllegalArgumentException se o número for negativo
            if (numero < 0) {
                throw new IllegalArgumentException("Número não pode ser negativo");
            }

            System.out.println("O número digitado é: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato inválido de número");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
