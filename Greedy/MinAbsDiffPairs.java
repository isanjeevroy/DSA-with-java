import java.util.Arrays;

public class MinAbsDiffPairs {
    public static void main(String args[]){  //O(nlogn)
        int a[]={1,2,3};
        int b[]={2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);
        
        int minResult=0;
        for(int i=0;i<a.length;i++){
            minResult+=Math.abs(a[i]-b[i]);
        }
        System.out.println("Min absolute diff of pairs is: "+minResult);
    }
}
