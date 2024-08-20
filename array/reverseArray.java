package array;

public class reverseArray {

    public static void rArray(int arr[]){
            int start=0, end=arr.length-1;

            while(start<end){
                
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] =temp;

                start++;
                end--;
            }
    }
    public static void main(String args[]){

        int arr[]={12,34,54,23,32,56};

        rArray(arr);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

    }
}
