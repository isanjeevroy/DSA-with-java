import java.util.*;
public class UnionIntersection {

    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0 ;i<arr1.length;i++){
            hs.add(i);
        }
        for(int i =0 ;i<arr2.length;i++){
            hs.add(i);
        }
        return hs.size();
    }

    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i =0 ;i<arr1.length;i++){
            hs1.add(i);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs1.contains(arr2[i])){
                count++;
                hs1.remove(i);
            }
        }
        return count;
    }
    public static void main(String args[]){

        int arr1[] ={7,3,9};
        int arr2[] ={6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
        
    }
}
