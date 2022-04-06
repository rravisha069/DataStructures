package com.ravi;

public class GraphUsingAdjacencyMatrix {
    int vertices;
    int[][] matrix;

    GraphUsingAdjacencyMatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void printGraph() {
        for(int i=0; i<vertices; i++) {
            for(int j=0; j<vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphUsingAdjacencyMatrix graphUsingAdjacencyMatrix = new GraphUsingAdjacencyMatrix(4);
        graphUsingAdjacencyMatrix.addEdge(0, 2);
        graphUsingAdjacencyMatrix.addEdge(1, 2);
        graphUsingAdjacencyMatrix.addEdge(2, 3);
        graphUsingAdjacencyMatrix.printGraph();
    }
}
