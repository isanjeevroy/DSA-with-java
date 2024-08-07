package ArrayList;
import java.util.*;

public class Maxwater{

    public static int water(ArrayList<Integer> height){
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int min=Math.min(height.get(i),height.get(j));
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(5);
        height.add(10);
        height.add(13);
        height.add(12);
    }
}