/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapimplementation;

/**
 *
 * @author pc
 */
public class HeapImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Heap h=new Heap(10);
        h.insert(80);
        h.insert(75);
        h.insert(60);
        h.insert(68);
        h.insert(55);
        h.insert(40);
        h.insert(52);
        h.insert(67);
        
        h.printHeap();
        h.delete(75);                 
        h.printHeap();
        
        h.peek();             //always shows the maximum value in the heap
        
       
        
    }
    
}
