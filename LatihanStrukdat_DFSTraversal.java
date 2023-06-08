/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanstrukdat_dfstraversal;
import java.util.*;
/**
 *
 * @author Abdillah
 */
public class LatihanStrukdat_DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];
    
    LatihanStrukdat_DFSTraversal(int v){
        adj = new LinkedList[v];
        visited = new boolean[v];
        
        for (int i=0; i<v; i++)
            adj[i] = new LinkedList<Integer>();
    }
    
    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }
    
    void DFS(int vertex){
    visited[vertex] = true;
    System.out.println(vertex+"");

Iterator<Integer> it = adj[vertex].listIterator();
while (it.hasNext()){
    int n = it.next();
    if (!visited[n])
        DFS(n);
}
    }
           

    public static void main(String[] args) {
    LatihanStrukdat_DFSTraversal graph = new LatihanStrukdat_DFSTraversal(8);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 3);
    graph.insertEdge(0, 4);
    graph.insertEdge(4, 5);
    graph.insertEdge(3, 5);
    graph.insertEdge(1, 2);
    graph.insertEdge(1, 0);
    graph.insertEdge(2, 1);
    graph.insertEdge(4, 1);
    graph.insertEdge(3, 1);
    graph.insertEdge(5, 4);
    graph.insertEdge(5, 3);
    
    System.out.println("Depth First Traversal for the  graph is:");
    graph.DFS(0);
    
        
    }
}
