import java.util.*;

public class collection 
{
    public static void main(String args[])
    {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Array Elemets");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println("Collection Elemets");
        System.out.println(al);
        System.out.println("removing Collection Elemets");
        al.remove(2);
        System.out.println(al);
    }
}
