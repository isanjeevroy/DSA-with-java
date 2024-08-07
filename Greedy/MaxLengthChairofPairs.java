import java.util.*;
public class MaxLengthChairofPairs {
    public static void main(String args[]){
        int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int valuePairs=1;
        int lastMin=pairs[0][0];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastMin){
                valuePairs++;
                lastMin=pairs[i][1];
            }
        }
        System.out.println("Max length chair of pairs is: "+valuePairs);
    }
}
