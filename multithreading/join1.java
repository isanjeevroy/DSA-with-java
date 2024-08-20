package multithreading;

public class join1 extends Thread
{
    static Thread mainthread;
    public void run()
    {
       
        try
        {
            mainthread.join();
            for(int i=1;i<=5;i++)
            {
                System.out.println("Chid thread: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        mainthread =Thread.currentThread();
        join1 t1=new join1();
        t1.start();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("main thread: "+i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
