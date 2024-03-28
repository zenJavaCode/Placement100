package multithreading;

public class JavaThreadsInterviewQuestions{

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();

    }
}
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.print(i);
        }
    }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1001; i <= 2000; i++)
        {
            System.out.print(i);
        }
    }
}


