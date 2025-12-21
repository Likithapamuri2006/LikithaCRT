/*Queue-->predifined interface in java util
    *First in First out for Linkedlist,priorityOrder for PriorityQueue.
    *Duplicates are allowed 
    *Elements cant accessed by index 

*/
import java.util.*;
public class ExampleforQueue {
    public static void main(String[] args) {
       // Queue s=new PriorityQueue();
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       pq.add(10);
       pq.add(20);
       pq.add(30);
       System.out.println(pq);

       System.out.println("------------------------------------");

       for(Object i:pq){
        System.out.println(pq);
       }
       System.out.println("------------------------------------");
       System.out.println(pq.poll());


    }
}
