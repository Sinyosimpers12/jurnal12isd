package com.company;

import java.util.LinkedList;

public class AdjacencyList {
    int V;
    LinkedList<Integer> adjListArray[];
    LinkedList<Integer> adjListArrayIn[];
    LinkedList<Integer> adjListArrayOut[];
    // constructor
    AdjacencyList(int V) {
        this.V = V;
        // define the size of array as
        // number of vertices
        adjListArray = new LinkedList[V];
        adjListArrayIn = new LinkedList[V];
        adjListArrayOut = new LinkedList[V];
        // Create a new list for each vertex
        // such that adjacent nodes can be stored
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
            adjListArrayIn[i] = new LinkedList<>();
            adjListArrayOut[i] = new LinkedList<>();
        }
    }
    // Adds an edge to an undirected graph
    public void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjListArray[src].add(dest);
        // Since graph is undirected, add an edge from dest
        // to src also
        adjListArray[dest].add(src);
        // untuk edge yang out
        adjListArrayOut[src].add(dest);
        // untuk edge yang in
        adjListArrayIn[dest].add(src);
    }
    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public void printGraphAlphabet() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + convertAlphabet(i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(convertAlphabet(adjListArray[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public void printGraphAlphabetIn() {
        for (int i = 0; i < V; i++) {
            if (adjListArrayIn[i].size() > 0) {
                System.out.print("Vertex " + convertAlphabet(i) + " is connected to: ");
                for (int j = 0; j < adjListArrayIn[i].size(); j++) {
                    System.out.print(convertAlphabet(adjListArrayIn[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public void printGraphAlphabetOut() {
        for (int i = 0; i < V; i++) {
            if (adjListArrayOut[i].size() > 0) {
                System.out.print("Vertex " + convertAlphabet(i) + " is connected to: ");
                for (int j = 0; j < adjListArrayOut[i].size(); j++) {
                    System.out.print(convertAlphabet(adjListArrayOut[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public String convertAlphabet(int i){
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(i, i+1);
    }
}
