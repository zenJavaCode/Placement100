package multithreading;
public class DeadLockExample {

    private static final Object account = new Object();
    private static final Object transaction = new Object();

    public static void main(String[] args) {
        Thread debitCard = new Thread(() -> {
            synchronized (account) {
                System.out.println("Thread debitCard: Holding an account object");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread debitCard: Before Holding transaction object");
                synchronized (transaction) {
                    System.out.println("Thread debitCard: Holding transaction object");
                    // Business logic related to the transaction
                }
            }
        });
        Thread anotherThread = new Thread(() -> {
            synchronized (transaction) {
                System.out.println("Thread anotherThread: Holding transaction object");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread anotherThread: Before Holding account object");
                synchronized (account) {
                    System.out.println("Thread anotherThread: Holding account object");
                    // Business logic related to the account
                }
            }
        });

        debitCard.start();
        anotherThread.start();
    }


}

