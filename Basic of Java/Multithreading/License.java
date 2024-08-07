package Multithreading;

class Medical extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Medical Starts");
            Thread.sleep(1000);
            System.out.println("Medical Completed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Testdrive extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Driving");
            Thread.sleep(1000);
            System.out.println("You are passed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Document checking");
            Thread.sleep(3000);
            System.out.println("Singned done");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class License {
    public static void main(String[] args) throws InterruptedException
    {
        Medical m=new Medical();
        m.start();
        m.join();

        Testdrive td=new Testdrive();
        td.start();
        td.join();

        OfficerSign os=new OfficerSign();
        os.start();
        
    }
    
}
