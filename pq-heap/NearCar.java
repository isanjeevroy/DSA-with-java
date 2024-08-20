import java.util.*;
public class NearCar {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dsqr;
        int i;
        Point(int x,int y,int dsqr,int i){
            this.x=x;
            this.y=y;
            this.dsqr = dsqr;
            this.i=i;
        }
        @Override
        public int compareTo(Point p2){
            return this.dsqr - p2.dsqr;
        }
    }
    public static void main(String args[]){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i=0;i<pts.length;i++){
            int dsqr = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],dsqr,i));
        }

        // to find the nearest
        for(int i=0;i<2;i++){
            System.out.println("C"+pq.remove().i);
        }
     
    }
}
