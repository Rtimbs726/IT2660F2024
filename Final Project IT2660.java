import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main { 

  public static void main(String[] args) { 

    String[] vertices = { 
      "Liberal Arts", 
      "Student Services", 
      "Health Careers & Sciences", 
      "Health Technologies Center", 
      "Recreation Center", 
      "Technology Learning Center", 
      "Business & Technology",
      "Theatre",
  }; 

    int[][] edges = { 
    {0,1}, {0,5}, {0,6}, {0,7},
    {1,0}, {1,2}, {1,4}, {1,5}, {1,6},
    {2,1}, {2,3}, {2,4}, {2,5},
    {3,2}, {3,4},
    {4,1}, {4,2}, {4,5},
    {5,0}, {5,1}, {5,2}, {5,4}, {5,6},
    {6,0}, {6,1}, {6,5}, {6,7},
    {7,0}, {7,6},
    }; 

    Graph<String> graph = new UnweightedGraph<>(vertices, edges); 
    UnweightedGraph<String>.SearchTree dfs = 
    graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices! 

    java.util.List<Integer> searchOrders = dfs.getSearchOrder(); 
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:"); 

    for (int i = 0; i < searchOrders.size(); i++) 
    System.out.print(graph.getVertex(searchOrders.get(i)) + " "); 
    System.out.println(); 

    for (int i = 0; i < searchOrders.size(); i++) 
    if (dfs.getParent(i) != -1) 
      System.out.println("parent of " + graph.getVertex(i) + 
      " is " + graph.getVertex(dfs.getParent(i)));

      System.out.println("\nDFS Tree:");
      printTree(dfs, graph);

      System.out.println("Starting from Business & Technology:");
      printPath(dfs, graph, "Health Technologies Center");
      printPath(dfs, graph, "Student Services");
      printPath(dfs, graph, "Recreation Center");
}
private static void printTree(UnweightedGraph<String>.SearchTree dfs, Graph<String> graph) {
  for (int i = 0; i < dfs.getNumberOfVerticesFound(); i++) {
      if (dfs.getParent(i) != -1) {            
      System.out.println("Vertex: " + graph.getVertex(i) + 
      ", Parent: " + graph.getVertex(dfs.getParent(i)));
}     else {
      System.out.println("Vertex: " + graph.getVertex(i) + 
      " is the root (no parent)");
}
}
}

private static void printPath(UnweightedGraph<String>.SearchTree dfs, Graph<String> graph, String target) {
        int targetIndex = graph.getIndex(target);
        if (targetIndex == -1) {
            System.out.println("Target " + target + " not found in the graph.");
            return;
        }

        List<String> path = new ArrayList<>();
        for (int v = targetIndex; v != -1; v = dfs.getParent(v)) {
            path.add(graph.getVertex(v));
        }
    Collections.reverse(path);
    System.out.println("Path to " + target + ": " + String.join(" -> ", path));
  }
}
