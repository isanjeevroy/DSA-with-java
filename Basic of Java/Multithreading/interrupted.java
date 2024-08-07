package Multithreading;

public class interrupted extends Thread
{
    public void run()
    {
        System.out.println("A1: "+Thread.interrupted());
        // System.out.println("A2: "+Thread.interrupted());
        // System.out.println("B1: "+Thread.currentThread().isInterrupted());
        // System.out.println("B2: "+Thread.currentThread().isInterrupted());
        try
        {
            
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println("A3: "+Thread.interrupted());
                
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
        interrupted t1=new interrupted();
        t1.start();
        // t1.interrupt();
    }
}
