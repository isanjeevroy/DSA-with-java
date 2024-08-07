
public class subArray {

    public static void printSubArray(int arr[]){

        int tP=0;
        int largest= Integer.MIN_VALUE;
        int preArray[]= new  int[arr.length];
        for(int i=0;i<arr.length;i++){
            preArray[i]+=arr[i];
            for(int j=i;j<arr.length;j++){
                
                int sum=0;
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k]+" " );
                    sum+=arr[k];
                }
                System.out.println();
                tP++;
                if(largest<sum){
                    largest=sum;
                }

            }
            System.out.println();
        }
        System.out.println("The total no of subsets is: "+tP);
        System.out.println("max. array sum is : "+largest);
        System.out.println(preArray);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
}
