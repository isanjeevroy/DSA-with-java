import java.util.*;
class rectangle{
    double length;
    double width;
    void read(double l, double w)
    {
        length=l;
        width=w;
    }
    void area()
    {
        double a= length*width;
        System.out.println("area:"+a);
    }
    void perimeter()
    {
        double p=2*(length+width);
        System.out.println("perimeter:"+p);
    }
}
public class Demo {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter length and width");
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        rectangle r=new rectangle();
        r.read(l,w);
        r.area();
        r.perimeter();

    }
}
