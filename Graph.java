import java.util.*;

public class Graph{
  ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
  int vertices;

  public Graph(int noOfNodes){
    vertices = noOfNodes;
    for(int i=0; i<vertices; i++) {
      arrList.add(new ArrayList<Integer>());
    }
  }

  public void addEdge(int v, int u) {
    arrList.get(v).add(u);
    arrList.get(u).add(v); 
  }

  public boolean isConnected(int v, int u) {
    return arrList.get(v).contains(u);
  }

  public void show() {
    for(int i=0; i<vertices; i++) {
      System.out.println(arrList.get(i));
    } 
  }
}