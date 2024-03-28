package multithreading;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Task implements Callable {

    private String message;

    public Task(String message) {
        this.message = message;
    }

//    @Override
//    public void run() {
//        System.out.println(message);
//        System.out.println(Thread.currentThread().getName());
//    }

    @Override
    public Object call() throws Exception {
        System.out.println(message);
        System.out.println(Thread.currentThread().getName());
        return null;
    }
}