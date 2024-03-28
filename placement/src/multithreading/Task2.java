package multithreading;

public class Task2 extends Thread{
    private String message;

    public Task2(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);

        for(int i =0;i<10;i++){
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() +" :"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
