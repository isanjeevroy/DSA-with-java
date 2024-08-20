class A
{
    void show(int a)
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    void show(int a)
    {
        System.out.println("Class B");
    }
}
class C extends A
{
    void show(int a)
    {
        System.out.println("Class C");
    }
}
public class overriding extends A{
    void show(int a)
        {
            System.out.println("Main Class");
        }
    public static void main(String[] args) {
        
        A ob=new A();
        ob.show(10);
        B ob3= new B();
        ob3.show(1);
        C ob2=new C();
        ob2.show(10);
        overriding ob1=new overriding();
        ob1.show(11);
    }
}
