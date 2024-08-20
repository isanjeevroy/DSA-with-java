package multithreading;

public class SleepMythread extends Thread
{
    
    public void run() 
    {
        for(int i=1;i<=5;i++)
        {
            
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception u)
            {
                // System.out.println(u);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        SleepMythread t1= new SleepMythread();
        t1.start();
    }
}
