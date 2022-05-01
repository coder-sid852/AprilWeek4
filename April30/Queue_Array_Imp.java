


// Java program to implement a queue using an array

 
public class Queue_Array_Imp {
 
    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        Queue q = new Queue(4);
 
        // print Queue elements
        Queue.queueDisplay();
 
        // inserting elements in the queue
        Queue.queueEnqueue(30);
        Queue.queueEnqueue(40);
        Queue.queueEnqueue(50);
        Queue.queueEnqueue(20);
 
        // print Queue elements
        q.queueDisplay();
 
        // insert element in the queue
        q.queueEnqueue(60);
 
        // print Queue elements
        q.queueDisplay();
 
        q.queueDequeue();
        q.queueDequeue();
        System.out.printf("\n\nafter two node deletion\n\n");
 
        // print Queue elements
        q.queueDisplay();
 
        // print front of the queue
        q.queueFront();
    }
}