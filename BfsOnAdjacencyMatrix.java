package com.ravi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsWithMatrixGraph {
    int vertices;
    int[][] matrix;

    BfsWithMatrixGraph(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public void traverse(int start) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()) {
            int i = queue.poll();
            System.out.print(i+ " ");

            for(int k = 0; k<vertices; k++) {
                if(matrix[i][k] == 1 && !visited.contains(k)) {
                    visited.add(k);
                    queue.add(k);
                }
            }
        }
    }
  
  public static void main(String[] args) {

        int vertices = 7;

         BfsWithMatrixGraph bfs = new BfsWithMatrixGraph(vertices);
         bfs.addEdge(0,1);
         bfs.addEdge(0,3);
         bfs.addEdge(1,2);
         bfs.addEdge(2,3);
         bfs.addEdge(2,6);
         bfs.addEdge(3,4);
         bfs.addEdge(4,5);
         bfs.addEdge(5,6);

         bfs.traverse(0);
  }
}
