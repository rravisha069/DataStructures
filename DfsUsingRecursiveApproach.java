package com.ravi;

import java.util.ArrayList;

public class DfsUsingRecursion {
    int vertices;
    int[][] matrix;

    DfsUsingRecursion(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public void traverse(int start) {
        ArrayList<Integer> visited = new ArrayList<>();
        System.out.println(start + " ");
        visited.add(start);
        for(int i = 0; i<vertices; i++) {
            if(matrix[start][i] == 1 && !visited.contains(i)) {
                visited.add(i);
                this.traverse(i);
            }
        }
    }
  
  public static void main(String[] args) {

        int vertices = 7;

         DfsUsingRecursion dfs = new DfsUsingRecursion(vertices);
         dfs.addEdge(0,1);
         dfs.addEdge(0,3);
         dfs.addEdge(1,2);
         dfs.addEdge(2,3);
         dfs.addEdge(2,6);
         dfs.addEdge(3,4);
         dfs.addEdge(4,5);
         dfs.addEdge(5,6);

         dfs.traverse(0);
  }
}
