/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan_bfstranversal;
import java.io.*;
import java.util.*;

/**
 *
 * @author Abdillah
 */
public class Latihan_BFSTranversal {
    
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    Latihan_BFSTranversal(int v){
        node = v;
        adj = new LinkedList[node];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void insertEdge(int v, int w){
        adj[v].add(w);
    }
    void BFS(int n){
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n]=true;
        que.add(n);
        while (que.size() != 0){
            n = que.poll();
            System.out.println(n+"");
            for (int i = 0; i<adj[n].size(); i++){
                a= adj[n].get(i);
                if (!nodes[a]){
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
       Latihan_BFSTranversal graph = new Latihan_BFSTranversal(6);
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
        System.out.println("Breadth First Traversal for the graph is :");
       graph.BFS(0);
       
    }
}
