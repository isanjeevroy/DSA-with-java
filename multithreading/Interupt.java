package multithreading;

public class Interupt extends Thread
{
    public void run()
    {
        try 
        {
            // Thread.sleep(1000);
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
        Interupt t=new Interupt();
        t.start();
        t.interrupt();
    }
}
