import java.util.*;
public class matrixmulti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2,i,j,k;
        System.out.println("Enter 1st matrix size");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter 2nd matrix size");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int m1[][]=new int[r1][c1];
        int m2[][]=new int[r2][c2];
        int m3[][]=new int[r1][c2];
        System.out.println("Enter the 1st matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {   
                int sum=0;
                for(k=0;k<c1;k++)
                {
                    sum+=m1[i][k]*m2[k][j];
                }
                m3[i][j]=sum;
                
            }
            System.out.println("");
        }
        System.out.println("Product of matrix is:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
