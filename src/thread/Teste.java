package thread;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		
		MinhaThreadRunnable Thread1 = new MinhaThreadRunnable("Thread 1 ", 500);
		MinhaThreadRunnable Thread2 = new MinhaThreadRunnable("Thread 2 ", 800);
		MinhaThreadRunnable Thread3 = new MinhaThreadRunnable("Thread 3 ", 400);
		
		Thread t1 = new Thread(Thread1);
		Thread t3 = new Thread(Thread2);
		Thread t2 = new Thread(Thread3);
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
	} 

}
