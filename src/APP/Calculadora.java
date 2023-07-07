package APP;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            
            int resultado = divide(num1, num2);
            
            System.out.println("O resultado da divisão é: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        
        scanner.close();
    }
    
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

//public class Calculadora {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		double result = 0;
//		try {
//			System.out.print("Digite o primeiro número: ");
//			double num1 = Double.parseDouble(scanner.nextLine());
//
//			System.out.print("Digite o segundo número: ");
//			double num2 = Double.parseDouble(scanner.nextLine());
//
//			System.out.print("Digite a operação desejada (+, -, *, /): ");
//			String operacao = scanner.nextLine();
//
//			double resultado;
//
//			if (operacao.equals("+")) {
//				result = resultado = num1 + num2;
//			} else if (operacao.equals("-")) {
//				result = resultado = num1 - num2;
//			} else if (operacao.equals("*")) {
//				result = resultado = num1 * num2;
//			} else if (operacao.equals("/")) {
//				result = resultado = num1 / num2;
//			}
//
//		} catch (NumberFormatException e) {
//			System.out.println("Erro: Valor não numérico inserido.");
//		} catch (ArithmeticException e) {
//			System.out.println("Erro: Divisão por zero não é permitida.");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("O resultado é: " + result);
//
//		scanner.close();
//	}
//}
