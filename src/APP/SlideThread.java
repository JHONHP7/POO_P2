package APP;

public class SlideThread {
	public static class Tarefa implements Runnable {
		private final String nome;

		public Tarefa(String nome) {
			this.nome = nome;
		}

		@Override
		public void run() {
			for (int i = 0; i <= 100; i = i + 20) {
				System.out.println("Tarefa " + nome + ": " + i + "%");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Tarefa("A"));
		Thread t2 = new Thread(new Tarefa("B"));
		t1.start();
		//Thread.sleep(1);
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Fim da thread principal!");
	}
}
