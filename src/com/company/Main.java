package com.company;

public class Main {

    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(9);
        myList.addEdge(0,1);
        myList.addEdge(0,3);
        myList.addEdge(0,4);

        myList.addEdge(1,4);

        myList.addEdge(2,1);

        myList.addEdge(3,6);

        myList.addEdge(4,5);
        myList.addEdge(4,7);

        myList.addEdge(5,2);
        myList.addEdge(5,7);

        myList.addEdge(6,7);

        myList.addEdge(7,8);

        myList.addEdge(8,5);
        myList.printGraphAlphabetOut();
    }
}
