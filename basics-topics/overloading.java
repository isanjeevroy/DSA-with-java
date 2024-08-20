public class overloading {
    
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public void add(int a, double b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        overloading ov =new overloading();
        ov.add(5,7);
        ov.add(4,5,6);
        ov.add(5,6.9);
    }
}
