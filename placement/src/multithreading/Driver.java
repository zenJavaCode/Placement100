package multithreading;

import java.util.concurrent.*;

public class Driver {

    public static void main(String[] args) throws Exception {


        Task t = new Task("Task is running");
        t.call();



//        Thread.sleep(400);
//     //   t.stop();
//
//        Thread t3 = Thread.currentThread();
//        for(int i =0;i<10;i++){
//            System.out.println(Thread.currentThread().getName());
//        }


//
        //Thread t2 = new Thread(t);
//        t2.start();
//System.out.println(Thread.currentThread().getName());
        //  MyRunnable runnable = new MyRunnable();
        // Thread t = new Thread(runnable);
        // t.start();
//        Thread3 t = new Thread3();
//        t.start();
//
//        for(int i =0;i<1000;i++){
//            System.out.print("God is great.");
//            System.out.println(Thread.currentThread().getName());
//        }
////    }

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.submit(new Task2("Task 1"));
//        executorService.submit(new Task2("Task 2"));
//        executorService.submit(new Task2("Task 3"));
//        executorService.shutdown();
//
//
//        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
//        threadPool.execute(new Task2("Task A"));
//        threadPool.execute(new Task2("Task B"));
//        threadPool.execute(new Task2("Task C"));
//        threadPool.shutdown();
//
//        Thread thread1 = new Thread(new Task2("Task X"));
//        Thread thread2 = new Thread(new Task2("Task Y"));
//        Task2 t2  = new Task2("Rahul");
//        t2.start();
//        t2.run();
//        thread1.start();
//        thread2.start();

    }

}
