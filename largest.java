import java.util.*;
public class largest {

    public static int largestNum(int arr[]){

        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
       return largest;
    }

    public static int smallestNum(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        return smallest;

    }

    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[]= new int[100];
            System.out.println("Enter the size of array");
            int n=sc.nextInt();
            System.out.println("The array elements");

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println("The largest value is :" +largestNum(arr));
            System.out.println("The smallest value is :" +smallestNum(arr));
        }

    }
}
