package DataStructuresAndAlgorithm.Graph_Alg;
import java.util.*;
public class Cycle_Detection {
	   public static void main(String[] args) { 
	        int numCourses= 4; 
	        int[][] prerequisites={ 
	            {1, 0}, 
	            {2, 1}, 
	            {0, 2}, 
	        }; 
	        System.out.println(canFinish(numCourses, prerequisites)); 
	    } 
	    static boolean canFinish(int numCourses, int[][] prerequisites) { 
	        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); 
	        for (int i = 0; i < numCourses; i++) { 
	            graph.add(new ArrayList<>()); 
	        } 
	        int[] indegree = new int[numCourses]; 
	        for (int[] prerequisite : prerequisites) { 
	            int course = prerequisite[0]; 
	            int prerequisiteCourse = prerequisite[1]; 
	            graph.get(prerequisiteCourse).add(course); 
	            indegree[course]++; 
	        } 
	        Queue<Integer>queue=new LinkedList<>(); 
	        for (int i=0; i<numCourses; i++) { 
	            if (indegree[i]==0) { 
	                queue.add(i); 
	            } 
	        } 
	        int count=0; 
	        while(!queue.isEmpty()) { 
	            int current=queue.poll(); 
	            count++; 
	       for(int neighbour : graph.get(current)){ 
	                indegree[neighbour]--; 
	                if (indegree[neighbour]== 0){ 
	                    queue.add(neighbour); 
	                } 
	            } 
	        } 
	        return count == numCourses; 
}
}
    

// int courses = 4
// int prerequisite ={{1,0} -> course=1
//,{2,1}
//,3,2}
// so dependency is
// 0->1
// 1->2
// 2->3      0->1->2->3(No cycle detected)
// graph =[]                      final
// for -> i=0 -> graph=[]          graph[0] = []
//        i=1 ->[[][]]             graph[1] = []
//        i=2 ->[[][][]]          graph[2] = []
//        i=3 ->[[][][][]]         graph[3] = []
// 
// Create indegree array:-
// indegree =[0,0,0,0]
// post indegree=[0,1,0,0]
// first loop : {1,0}
// int course = prerequisite[0]
// course=1
// int prerequisite = prerequisite[1]
//
//graph[0] = [1]
//graph[1] = []
//graph[2] = []
//graph[3] = []
//
//indegree [course]++;
// indegree[1]++
// 
// second loop:  dependency = 1->2
//graph[0] = [1]
//graph[1] = [2]
//graph[2] = []
//graph[3] = []
//
// post indegree=[0,1,1,0] 
// 
// third loop : 2->3
// 
// post indegree=[0,1,1,1] 
// 
// queue=[]
// every element check
// course            indegree          Action
// 0                     0
// 1                     1
// 2                     1
// 3                     1
// 
// indegree[i]==0  ->add queue
// 0==0 => T     queue[0]
// 
// int count =0(initially)
// (now) count =1
// 
// while(!pq.isEpmty)
//
//
//Round       Removed-Course       count        indegree         Queue
//1               0                  1           [0,1,1,1]        [0](at index)
//2               1                  2           [0,0,1,1]        [1]
//3               2                  3           [0,0,0,1]        [2] 
//4               3                  4           [0,0,0,0]        [3]
//
//return count
//
//
//
//