
//Reference used https://algs4.cs.princeton.edu/41graph/Graph.java.html
//https://stackoverflow.com/questions/1737627/java-how-to-represent-graphs
//https://stackoverflow.com/questions/10180173/creating-a-graph-in-java
//https://stackoverflow.com/questions/50050926/java-reading-text-file-as-an-integer-and-split-each-line-into-array
//youtube

import java.io.*;
import java.util.*;

class Graph {
 private int V; // No. of vertices
 private LinkedList<Integer> adjacent[]; // Adjacency Lists

 // Constructor
 public Graph(int numVertices) {
  V = numVertices;
  adjacent = new LinkedList[numVertices];
  // created a linked list for each
  for (int i = 0; i < numVertices; ++i)
   adjacent[i] = new LinkedList();
 }
 
 public void addEdge(int first, int second) {
  
  //if edge already exists, will do nothing
  if(adjacent[first].contains(second)){
      return;
  }
  // undirected graph has bidirectional connections
  else{
      adjacent[first].add(second);
      adjacent[second].add(first);
  }
 }

    //prints out all the neighbors
    public void getAllNeighbors(int v) {
  for (int i = 0; i < adjacent[v].size(); ++i){
   System.out.print(adjacent[v].get(i) + " ");
  }
 }
 
 //does an edge exist? 
 public boolean edgeExists(int first, int second){
     try{
         return adjacent[first].contains(second);
     }catch(IndexOutOfBoundsException e){
         return false;
     }
 }
 

 //BFS to print out all Vertices 
 public void getAllVertices(int vertex){
     
     //creating title for print out
     String[] printList = new String[V];
     for (int i = 0; i < V; i++) {
   printList[i] = "\nVertices of " + i + "\n";
     }
     
     boolean visited[] = new boolean[V];
     LinkedList<Integer> queue = new LinkedList<Integer>();
     
     visited[vertex] = true;
     queue.add(vertex);
     
     while(queue.size() != 0){
         
         //Dequeue a vertex from queue and print
         vertex = queue.poll();
         
         //adding each neighbor to the printList
         for(int i=0; i<adjacent[vertex].size(); i++){
             printList[vertex] += " -> " + adjacent[vertex].get(i);
         }
         
         Iterator<Integer> neighbors = adjacent[vertex].listIterator();
         
         //going through all the neighbors
         while(neighbors.hasNext()){
             int n = neighbors.next();
             if(!visited[n]){
                 visited[n] = true;
                 queue.add(n);
             }
         }
     }
     
     for (int i = 0; i < printList.length; i++) {
         System.out.println(printList[i]); 
         System.out.println();
     }
     
 }


 // Driver method
 public static void main(String args[]) throws IOException {
  BufferedReader read = new BufferedReader(new FileReader("graph_input.txt"));
        
        ArrayList<Integer> seenNumbers = new ArrayList<Integer>();
        //find out how many numbers exist
        String line = read.readLine();
  while (line != null) {
      String[] values = line.split(",");
      int first = Integer.parseInt(values[0]);
   int second = Integer.parseInt(values[1]);
   
   if(!seenNumbers.contains(first)){
       seenNumbers.add(first);
   }
   if(!seenNumbers.contains(second)){
       seenNumbers.add(second);
   }
   
   line = read.readLine();
   
  }
        

  int V = seenNumbers.size()+1;
  Graph g = new Graph(V);
        
   read = new BufferedReader(new FileReader("graph_input.txt"));
  line = read.readLine();
  while (line != null) {

   String[] values = line.split(",");
   int first = Integer.parseInt(values[0]);
   int second = Integer.parseInt(values[1]);
   g.addEdge(first, second);
   line = read.readLine();
  }
  
  //step 1
    
  System.out.println("\nAdjacent vertices for node 2" );
  g.getAllNeighbors(2);
  
  System.out.println("\n");
  
  //step 2
   System.out.println("Edge (10,2)exists:");
  System.out.println(g.edgeExists(10,2));
  
  //step 3
  g.getAllVertices(1);
 }

 }