import java.util.*;
public class prime 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for( int i=1;i<=n;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    temp++;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp=0;
            }
        }
        
    }
}
