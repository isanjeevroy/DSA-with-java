package multithreading;

class BookTheatherSeats
{
    int total_seats=10;
    void bookseats(int seats)
    {
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        // synchronized(this)
        // {
        if(seats<=total_seats)
        {
            System.out.println(seats+" Seats booked Sucessfully");
            total_seats-=seats;
            System.out.println("Seats left: "+total_seats);
        }
        else
        {
            System.out.println("Sorry seat can't be booked...!!!");
            System.out.println("Seats left: "+total_seats);
        }
        // }
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
        System.out.println("Hii"+Thread.currentThread().getName());
    }
}

public class MoiveBookApp1 extends Thread
{
    static BookTheatherSeats b;
    int seats;
    public void run()
    {
        b.bookseats(seats);
    }
    public static void main(String[] args) 
    {
        b=new BookTheatherSeats();
        MoiveBookApp1 pushpa=new MoiveBookApp1();
        pushpa.seats=7;
        pushpa.start();

        MoiveBookApp1 rashmika =new MoiveBookApp1();
        rashmika.seats=6;
        rashmika.start();

    }
}
