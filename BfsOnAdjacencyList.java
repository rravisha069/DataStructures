package com.ravi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    int v;
    ArrayList<ArrayList<Integer>> adj;

    Bfs(int v) {
        this.v = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0; i<v; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

//    public void printGraph(ArrayList<ArrayList<Integer>> adj) {
//        for(int i=0; i<adj.size(); i++) {
//            System.out.println("Adjacent List of vertex " + i);
//            for(int j=0; j<adj.get(i).size();j++) {
//                System.out.print(" => " + adj.get(i).get(j));
//            }
//            System.out.println();
//        }
//    }

    public void traverse(int source) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>();

        queue.add(source);
        visited.add(source);


        while(!queue.isEmpty()) {
            int s = queue.poll();
            System.out.println(s + " ");

            Iterator<Integer> i = adj.get(s).listIterator();
            while(i.hasNext()) {
                int j = i.next();
                if(!visited.contains(j)) {
                    visited.add(j);
                    queue.add(j);
                }
            }
        }
    }
  
  public static void main(String[] args) {

        int vertices = 7;

         Bfs bfs = new Bfs(vertices);
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
