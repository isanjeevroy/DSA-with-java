import java.util.*;
public class ActivitySelection {
    public static void main(String args[]){
        int start[]={0,1,3,5,8,5};
        int end[]={6,2,4,7,9,9};

        int activities[][]=new int[end.length][3];
        for(int i=0;i<end.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // ! sorting the 2-D arrays via any one coloum;
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));
        
        // printing the 2-D arrays
        for(int i=1;i<3;i++){
            for(int j=0;j<end.length;j++){
                System.out.print(activities[j][i]+" ");
            }
            System.out.println();
        }

        int maxActi=activities[0][0];
        ArrayList<Integer> idx= new ArrayList<>();
        maxActi=activities[1][0];

        idx.add(0);
        int prevTime=activities[0][2];
        for(int i=1;i<end.length; i++){
            if(activities[i][1]>=prevTime){
                idx.add(i);
                maxActi++;
                prevTime=activities[i][2];
            }
        }
        System.out.println("Max activity count is: "+maxActi);
        for(int i=0;i<idx.size();i++)
            System.out.print("A"+idx.get(i)+" ");
    }
}
