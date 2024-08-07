import java.util.*;

public class Aaaaa {

    static int minFun(int arr[], int n) {

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;

        maxFreq = Collections.max(mp.entrySet(),
                Comparator.comparingInt(Map.Entry::getKey)).getValue();

        return (n - maxFreq);
    }

    public static void main(String[] args) throws java.lang.Exception {
        
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m>0){
		    m--;
		    // your code goes here
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int arr[] = {'6','2','5','5','4','5','6','3','7','6'};
		    int count =0;
		    int rem;
		    int result = a+b;
		    
		    while(result>0){
		        rem = result%10;
		        
		        result = result/10;
		        
		        count+=arr[rem];
		        
		    }
		    System.out.println(arr[rem]);
		}
    }

}
