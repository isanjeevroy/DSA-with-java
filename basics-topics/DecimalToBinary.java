import java.util.Scanner;

public class DecimalToBinary
{    
    public static void tobinary(int num)
    {
        int index=0;
        int arr[]=new int[40];
        while(num>0)
        {
          arr[index++]=num%2;
          num=num/2;
        }
        for(int i=index-1;i>=0;i--)
        {
          System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      tobinary(num);
    }
}      