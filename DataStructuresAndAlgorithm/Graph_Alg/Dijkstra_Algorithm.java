package DataStructuresAndAlgorithm.Graph_Alg;

import java.util.Arrays;

public class Dijkstra_Algorithm {
    public static void main(String[] args) { 
    int[][] graph = { 
        {0, 4, 1, 0}, 
        {4, 0, 0, 1}, 
        {1, 0, 0, 2}, 
        {0, 1, 2, 0} 
    }; 
    dijkstra(graph, 0); 
} 
static void dijkstra(int[][] graph, int source) { 
    int vertices = graph.length; 
    int[] distance = new int[vertices]; 
    boolean[] visited = new boolean[vertices]; 
    Arrays.fill(distance, Integer.MAX_VALUE); 
    distance[source] = 0; 
    for (int count = 0; count < vertices; count++) { 
        int current = -1; 
        for (int i = 0; i < vertices; i++) { 
            if (!visited[i] && (current == -1 || distance[i] < distance[current])) { 
                current = i; 
            } 
        } 
        visited[current] = true; 
        for (int i = 0; i < vertices; i++) { 
            if (graph[current][i] != 0 && 
                distance[current] != Integer.MAX_VALUE && 
                distance[current] + graph[current][i] < distance[i]) { 
                distance[i] = distance[current] + graph[current][i]; 
            } 
        } 
    } 
    for (int i = 0; i < vertices; i++) { 
        System.out.println("Distance from " + source + " to " + i + " = " + 
distance[i]); 
    }
}

}
// from vertex        to vertex      height
// 0                  0               0
// 0                  1               4
// 0                  2               1        
// 0                  3               0
//   
// source =0
// [0,0,0,0]
// (initially) distance=[D,D,D,D]
// 
// 
//Round 1 
// vertex      Distance        Visited
// 0             0               true
// 1             D               false
// 2             D               false
// 3             D               false
// 
//Weight Calculations
//
// 1->0  ->4
// 1->1  ->1
// 1->2  ->0
// 1->3  ->0 
// 
// 2->0  ->
// 2->1  ->
// 2->2  ->
// 2->3  ->
// 
// 3->0  ->
// 3->1  ->
// 3->2  ->
// 3->3  ->
// 
// 
// 
// 
