import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs, (ob1,ob2)->ob2.profit-ob1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        // print the sequence
        System.out.println("Max job size is: "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
