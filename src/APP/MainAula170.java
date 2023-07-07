package APP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAula170 {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		System.out.println("****METHOD1 START****");
		method2();
		System.out.println("****METHOD1 END****");
	}

	public static void method2() {
		System.out.println("****METHOD2 START****");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" "); // ler varios itens e salvar no vetor
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid position");
//			e.printStackTrace();
//			sc.next();
		} catch (InputMismatchException e) {
			System.err.println("Input error");
		}
		System.out.println("****METHOD2 END****");
		sc.close();
	}
}
