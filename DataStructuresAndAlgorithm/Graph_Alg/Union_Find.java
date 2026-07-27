package DataStructuresAndAlgorithm.Graph_Alg;

public class Union_Find {
	static int[] parent; 
    public static void main(String[] args) { 
        int vertices = 5; 
        parent = new int[vertices]; 
        for (int i = 0; i < vertices; i++) { 
            parent[i] = i; 
        } 
        union(0, 1); 
        union(1, 2); 
        union(3, 4); 
        System.out.println(find(0) == find(2)); 
        System.out.println(find(0) == find(4)); 
    } 
    static int find(int vertex) { 
        if (parent[vertex] == vertex) { 
            return vertex; 
        } 
        parent[vertex] = find(parent[vertex]); 
        return parent[vertex]; 
    } 
    static void union(int vertex1, int vertex2) { 
        int parent1 = find(vertex1); 
        int parent2 = find(vertex2); 
        if (parent1 != parent2) { 
            parent[parent2] = parent1; 
        }
}
}
