package DataStructuresAndAlgorithm.Graph_Alg;
import java.util.*;


public class Topological_alg {
    public static void main(String[] args) {
        int vertices =6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);
        topologicalSort(graph,vertices);
        
    }
    static void topologicalSort(ArrayList<ArrayList<Integer>>graph,int vertices){
        int[] indegree = new int[vertices];
        for(int i=0;i<vertices;i++){
            for(int neighbour : graph.get(i)){
                indegree[neighbour]++;
            }

        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<vertices;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.println(current+" ");
            for(int neighbour : graph.get(current)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }
    }
    

}
// 
// 5->2
// 5->0
// 4->0
// 4->1
// 2->3
// 3->1
// 
// indegree = no.of incoming edges to a vertex
// 
// 
//vertex           incoming edges            indegree 
// 0               5->0,4->0                    2      
// 1               4->1,3->1                    2
// 2               5->2                         1
// 3               2->3                         1
// 4               none                         0
// 5               none                         0
// indegree = {2,2,1,1,0,0}
// 
// Ist step -> 4&5 -> there is no incoming edge    ->Queue=(4,5)      neighbour of 4
//                                                                       4->0      
//                                                   Queue=(4)           4->1        
//         indegree(0) = 2-1 => 1
//         indegree(1) = 
// 
