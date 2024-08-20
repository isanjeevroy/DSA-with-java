package multithreading;

public class ThreadPriorities extends Thread
{
    public void run()
    {
        System.out.println("Child Thread :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
    {
        System.out.println("Main thread: "+Thread.currentThread().getPriority());
        ThreadPriorities t=new ThreadPriorities();
        Thread.currentThread().setPriority(8);
        t.setPriority(6);
        t.start();
    }
}
