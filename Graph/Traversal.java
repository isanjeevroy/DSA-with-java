import java.util.*;
public class Traversal {
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
    // ! create graph function
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1's
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2's
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3's
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        
        // 4's
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        
        // 5's
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));
        
        // 6's
        graph[6].add(new Edge(6, 5, 1));

    //     // 7's
    //     graph[7].add(new Edge(7, 8, 1));
    //     graph[7].add(new Edge(7, 9, 1));

    //     // 8's
    //     graph[8].add(new Edge(8, 7, 1));
    //     graph[8].add(new Edge(8, 10, 1));

    //     // 9's
    //     graph[9].add(new Edge(9, 7, 1));
    //     // 10's
    //     graph[10].add(new Edge(10, 8, 1));
    // }

    //! bfs -> using Queue

    public static void bfs(ArrayList<Edge>[] graph ,int start, boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    //! dfs -> using stack (Recursion)

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
                dfs(graph, e.dest, vis);
        }
    }
    public static void main(String args[]){
        int V=7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i])
                bfs(graph, i, vis);
        }
       
    }
}
