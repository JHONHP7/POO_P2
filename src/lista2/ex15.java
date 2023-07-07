package lista2;

import java.util.Scanner;

public class ex15 {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        Thread thread1 = new Thread(new ContadorPrimosThread(0, n / 2));
        Thread thread2 = new Thread(new ContadorPrimosThread(n / 2 + 1, n));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Quantidade de números primos entre 0 e " + n + ": " + count);
    }

    public static synchronized void incrementCount() {
        count++;
    }

    static class ContadorPrimosThread implements Runnable {
        private int inicio;
        private int fim;

        public ContadorPrimosThread(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
        }

        @Override
        public void run() {
            for (int i = inicio; i <= fim; i++) {
                if (isPrimo(i)) {
                    incrementCount();
                }
            }
        }

        private boolean isPrimo(int num) {
            if (num < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
