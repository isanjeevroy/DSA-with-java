
public class binarySearch{
    
    public static int bnSearch(int arr[], int key){

        int start=0, end=arr.length-1;
        int mid=(start+end)/2;

        while(start<=end){

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<=key){
                start=mid-1;
            }
            else{
                end=mid+1;
            }
        }
        return -1;

    }

    public static void main(String args[]){

        int arr[]={12,23,34,45,56,78};
        int key=34;
        int index = bnSearch(arr,key);
        System.out.println("The index is: "+index);
    }
}
