/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapimplementation;
import java.util.PriorityQueue;

/**
 *
 * @author pc
 */
public class PriorityQueueImplementation {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);
        
        System.out.println(pq.peek());       //prints the min. number in the heap
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.poll());    //another way to remove the root
        System.out.println(pq.peek());
        System.out.println(pq.remove(54));      //returns boolean value if successfully removed
        System.out.println(pq.peek());
       
        
        Object[] ints=pq.toArray();          
        for(Object i:ints)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("");
    }
    
}
