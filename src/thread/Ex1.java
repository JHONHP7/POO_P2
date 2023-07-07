package thread;

class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        while (count >= 3) {
            try {
                System.out.println("Incrementando: Aguardando. Count atingiu o máximo (3).");
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

        count++;
        System.out.println("Incrementando: Count incrementado. Novo valor de count: " + count);
        notifyAll();
    }

    public synchronized void decrement() {
        while (count <= 0) {
            try {
                System.out.println("Decrementando: Aguardando. Count atingiu o mínimo (0).");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        count--;
        System.out.println("Decrementando: Count decrementado. Novo valor de count: " + count);
        notifyAll();
    }
}

class CounterThread implements Runnable {
    private Counter counter;
    private boolean increment;

    public CounterThread(Counter counter, boolean increment) {
        this.counter = counter;
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (increment) {
                counter.increment();
            } else {
                counter.decrement();
            }

            try {
                Thread.sleep((int) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(new CounterThread(counter, true));
        Thread decrementThread = new Thread(new CounterThread(counter, false));

        incrementThread.start();
        decrementThread.start();
    }
}

