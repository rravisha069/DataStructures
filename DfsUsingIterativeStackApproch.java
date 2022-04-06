package com.ravi;

import java.util.ArrayList;
import java.util.Stack;

public class DfsUsingIterativeApproach {
    int vertices;
    int[][] matrix;

    DfsUsingIterativeApproach(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public void traverse(int start) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> visited = new ArrayList<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            int i = stack.peek();
            System.out.print(i + " ");

            stack.pop();
            for(int j=0; j<vertices; j++) {
                if(matrix[i][j] == 1 && !visited.contains(j)) {
                    visited.add(j);
                    stack.push(j);
                }
            }
        }
    }
  
  public static void main(String[] args) {

        int vertices = 7;

         DfsUsingIterativeApproach dfs = new DfsUsingIterativeApproach(vertices);
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
