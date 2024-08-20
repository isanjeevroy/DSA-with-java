package collections;

public class NextGreaterElem {

    public static void nextElement(int arr[],int nextArr[]){
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                nextArr[i]=-1;
                return;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    nextArr[i]=arr[j];
                    break;
                }
                else{
                    nextArr[i]=-1;
                }
            }
        }
    }
    public static void main(String agrs[]){

        int arr[]={6,8,0,1,3};
        int nextArr[]= new int[arr.length];
        nextElement(arr, nextArr);

        for(int i=0;i<arr.length;i++){
            System.out.print(nextArr[i]+" ");
        }
        
    }
}
