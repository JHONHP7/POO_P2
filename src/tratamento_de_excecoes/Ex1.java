package tratamento_de_excecoes;

public class Ex1 {
    public static void main(String[] args) {
        String numeroString = "123";

        String textoInvalido = "abc";
        try {
            int numeroInvalido = Integer.parseInt(textoInvalido);
            System.out.println("Número inválido: " + numeroInvalido);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        }

        try {
            int numeroValido = Integer.parseInt(numeroString);
            System.out.println("Número válido: " + numeroValido);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        }

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
