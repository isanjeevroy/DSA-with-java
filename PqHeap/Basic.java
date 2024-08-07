import java.util.*;
public class Basic {

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        // pq.add(new Student("A", 4));
        // pq.add(new Student("B", 12));
        // pq.add(new Student("C", 2));
        // pq.add(new Student("D", 5));

        while(!pq.isEmpty()){
            // System.out.println(pq.peek().name +"->"+ pq.peek().rank);
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
