package Multithreading;

public class join extends Thread
{
    public void run()
    {
        try
        {
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
        join t1=new join();
        t1.start();
        t1.join();
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
