package multithreading;

class BookTheatherSeats
{
    int total_seats=10;
    synchronized void bookseats(int seats)
    {
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
    }
}

public class MoiveBookApp extends Thread
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
        MoiveBookApp pushpa=new MoiveBookApp();
        pushpa.seats=7;
        pushpa.start();

        MoiveBookApp rashmika =new MoiveBookApp();
        rashmika.seats=6;
        rashmika.start();
    }
}
