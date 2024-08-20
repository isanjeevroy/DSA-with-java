package multithreading;

public class MultiSleep extends Thread
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {

            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) 
    {
        MultiSleep t1=new MultiSleep();
        t1.start();
        MultiSleep t2=new MultiSleep();
        t2.start();
    }
}
