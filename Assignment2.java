import java.util.ArrayList;

public class Assignment2 {
 ArrayList<String> fruit=  new ArrayList<String>(); 
 
 ArrayList<String> q=  new ArrayList<String>(); //for queue function to work
 /**
  * 
  * Implement the printStack function
  *
  */
 public class Stack {
  
  public void push(String node) {
   fruit.add(node);
  }
  public String pop() {
   if(!isEmpty()) {
   String value = fruit.get(fruit.size()-1);
   fruit.remove(fruit.size()-1);
   return value;
   }
   else {
    System.out.println("There is nothing to pop");
    return null;
   }
  }
  public boolean isEmpty() {
   return fruit.size()==0;   
  }
  public void printStack() {
    for(int i = fruit.size()-1; i>=0; i--) //code for printing vertically
    {
   System.out.println(fruit.get(i));
   
  }
  }
  
 
  /**
   * Implement the Queue functions here
   */
  public Stack() {
   
  }

 }
 
 public class Queue{
   
  public void enqueue(String node) { //I did this code similarly code above of push pop and print stack
   q.add(node);
  }


  public String dequeue() {
   if(!isEmpty()) {
   String value = q.get(q.size()-1);
   q.remove(q.size()-1);
   return value;
   }
   else {
    System.out.println("There is nothing to remove");
    return null;
   }
  }
  public boolean isEmpty() {
   return q.size()==0;   
  }
  public void printQueue() {
 //  System.out.println("Not implmented yet");
   for(int i = q.size()-1; i>=0; i--) //code for printing vertically
{
  System.out.println(q.get(i)); 
}
  }
  
  public Queue() {
   
  }
 }
 
/**
 * 1) Finish the Stack Class so that the print_stack method prints the stack vertically so that for instance ['a','b','c'] is printed 
 * a
 * b
 * c
 * 
 * 
 * 2) Write Queue functions for enqueue, dequeue, isEmpty and printQueue
 */
 public Assignment2() {
  Stack fruit= new Stack();
  fruit.pop();
  fruit.push("Apple");
  fruit.push("Banana");
  fruit.pop();
  fruit.push("Canned Yams");
  fruit.push("Durian");
  fruit.printStack();
  fruit.pop();
  fruit.pop();
  fruit.printStack();
  
  
  Queue q= new Queue();

 
  q.enqueue("Job 1");
  q.enqueue("Job 2");
  q.enqueue("Job 3");
  q.printQueue();
  q.dequeue();
  q.dequeue();
  q.printQueue();
        
 }

 
 public static void main(String[] args) {
  new Assignment2();

 }
}



