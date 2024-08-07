package Multithreading;

public class yieldjava extends Thread 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
    public static void main(String[] args) 
    {
        yieldjava t1=new yieldjava();
        t1.start();
        Thread.yield(); //If you want to stop main method and provide chance to other method for excution
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
