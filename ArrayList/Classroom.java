package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // add elements

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        System.out.println(list);


        // // Get operation
        // int element = list.get(2);
        // System.out.println(element);

        // Remove operation

        // list.remove(2);
        // System.out.println(list);


        // Set element at index
        // list.set(2, 10);
        // System.out.println(list);

        // // Cotains opeation
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(13)); 


        // //  get size of array list
        // System.out.println(list.size());


        // // max value in arraylist

        // int max1=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(max1<list.get(i)){
        //     //     max1=list.get(i);
        //     // }
        //     max1=Math.max(max1,list.get(i));
        // }
        // System.out.println("The max value is:"+max1);

            swap(list, 0, 3);
            System.out.println(list);

            // sorting the arraList elements
            Collections.sort(list);
            System.out.println(list);

            // descending order
            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);

    }

}
