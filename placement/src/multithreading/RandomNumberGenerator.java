package multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator  implements Callable {
    @Override
    public Object call() throws Exception {
        Random random = new Random();
         Integer i = random.nextInt();
        System.out.println("Randon number Generated : "+ i + " Thread : "+Thread.currentThread().getName());
        return i;
    }
}
