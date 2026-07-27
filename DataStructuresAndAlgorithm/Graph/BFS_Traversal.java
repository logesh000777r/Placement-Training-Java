package DataStructuresAndAlgorithm.Graph;
import java.util.*;

public class BFS_Traversal {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,1,4);

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int node = queue.remove();
            System.out.print(node + " ");
            for(int neighbour : graph.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            
        }
        }
        


    }
    static void addEdge(ArrayList<ArrayList<Integer>>graph ,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

}
