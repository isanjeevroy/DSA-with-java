public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        Pen p2=new Pen();
        p2.setColor("red");
        System.out.println(p2.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    
}
