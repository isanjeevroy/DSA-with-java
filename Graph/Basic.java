import java.util.*;
public class Basic {

    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        
        //o's
        graph[0].add(new Edge(0, 1, 5));

        // 1's
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2's
        graph[2].add(new Edge(2, 1, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3's
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        
        // 4's
        graph[4].add(new Edge(4, 2, 2));


        // !find the 2's neighbour
        for(int i=0;i<graph[2].size();i++){
            System.out.print(graph[2].get(i).dest + " ");
        }
    }
}
