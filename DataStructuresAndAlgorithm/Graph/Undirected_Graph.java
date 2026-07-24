package DataStructuresAndAlgorithm.Graph;
import java.util.*;
public class Undirected_Graph {
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,3);
        addEdge(graph,2,4);
        for(int i=0;i<vertices;i++){
            System.out.println(i+" -> "+graph.get(i));
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>>graph, int u ,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);

    }

}
