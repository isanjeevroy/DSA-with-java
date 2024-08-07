import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int t1=no;
    int len=0;
    while(t1!=0)
    {
        t1=t1/10;
        len=len+1;
    }
    int t2=no;
    int rem;
    int i;
    int arms=0;
    while(t2!=0)
    {
        int mul=1;
        rem=t2%10;
        for(i=1;i<=len;i++)
        {
            mul=mul*rem;
        }
        t2=t2/10;
        arms+=mul;
    }
    if(no==arms)
    {
        System.out.println(no+" is armstrong number");
    }
    else
    {
        System.out.println(no+" is not armstrong number");
    }
}
}
