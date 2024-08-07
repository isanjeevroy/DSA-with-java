
public class piarsArray {

    /**
     * @param arr
     */
    public static void printPairs(int arr[]){
        
        int tp=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs is: "+tp);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        printPairs(arr);
    }
    
}
