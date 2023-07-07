package thread;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Digite o numero de fobbonaci desejado: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TarefaFibonnaci f1 = new TarefaFibonnaci(n-1);
		TarefaFibonnaci f2 = new TarefaFibonnaci(n-2);
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			
		}catch(InterruptedException e){
			System.out.println("Danase");
		}
		try {
			t2.join();
			
		}catch(InterruptedException e){
			System.out.println("Danase");
		}
		System.out.println("Resultado= " + (f1.result + f2.result));
	}

}

class TarefaFibonnaci implements Runnable {
	long n;

	long result;

	public TarefaFibonnaci(long n) {
		this.n = n;
	}
	
	public long fibonacci(long n) {
		if(n==0|| n ==1) {return n;}
		else {return fibonacci(n-1) + fibonacci(n-2);}
	}
	
	@Override
	public void run() {
		result = fibonacci(n);
	}
}