package tratamento_de_excecoes;

public class Ex1 {
    public static void main(String[] args) {
        String numeroString = "123";

        // Tentativa de conversão de uma string inválida em um número
        String textoInvalido = "abc";
        try {
            int numeroInvalido = Integer.parseInt(textoInvalido);
            System.out.println("Número inválido: " + numeroInvalido);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        }

        // Tentativa de conversão de uma string válida em um número
        try {
            int numeroValido = Integer.parseInt(numeroString);
            System.out.println("Número válido: " + numeroValido);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        }

        // Utilização de um argumento inválido em um método
        try {
            int valorNegativo = -5;
            if (valorNegativo < 0) {
                throw new IllegalArgumentException("Valor inválido: valor negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de argumento: " + e.getMessage());
        }
    }
}
