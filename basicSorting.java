import java.util.*;

public class basicSorting {

    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // bubble sort
    public static void bubbleSort(Integer arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // selection sort
    public static void selectionSort(Integer arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap 
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }

    // insertion sort
    public static void insertionSort(Integer arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct pos to insert
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }

    // counting sort
    public static void countingSort(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder());
        // bubbleSort(arr); 
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        printArray(arr);

    }
}
