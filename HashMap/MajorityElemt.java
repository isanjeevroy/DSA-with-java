import java.util.*;
public class MajorityElemt {
    public static void main(String args[]){

        int nums[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        Set<Integer> keys = hm.keySet();

        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            
            if(hm.containsKey(k)){
                hm.put(k,hm.get(k)+1);
            }
            else{
                hm.put(k, 1);
            }
        }

        // find the frequency
        for (Integer i : keys) {
            if(hm.get(i)>nums.length/3){
                System.out.println(i);
            }
        }

    }
}
