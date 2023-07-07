package lista2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecimalParaRomano {
    private static final Map<Integer, String> mapaRomano = new HashMap<>();

    static {
        mapaRomano.put(1, "I");
        mapaRomano.put(4, "IV");
        mapaRomano.put(5, "V");
        mapaRomano.put(9, "IX");
        mapaRomano.put(10, "X");
        mapaRomano.put(40, "XL");
        mapaRomano.put(50, "L");
        mapaRomano.put(90, "XC");
        mapaRomano.put(100, "C");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal (até 3 dígitos): ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 999) {
            System.out.println("Número inválido. Por favor, digite um número decimal de até 3 dígitos.");
            return;
        }

        String romano = converterParaRomano(numero);

        System.out.println("Número romano equivalente: " + romano);
    }

    public static String converterParaRomano(int numero) {
        StringBuilder resultado = new StringBuilder();

        int[] valoresDecimais = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        for (int valor : valoresDecimais) {
            while (numero >= valor) {
                resultado.append(mapaRomano.get(valor));
                numero -= valor;
            }
        }

        return resultado.toString();
    }
}
