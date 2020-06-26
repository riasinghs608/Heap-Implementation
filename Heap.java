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
public class Heap {
    
    private int[]heap;
    private int size;
    
    public Heap(int c)
    {
        heap=new int[c];
    }
    
    public boolean isfull()
    {
        return size==heap.length;
    }
    
    public int getParent(int i)
    {
        return (i-1)/2;
    }
    
    
    public boolean isEmpty()
    {
        return size==0;
    }
    
    public int getChild(int i,boolean left)
    {
        return 2*i+(left?1:2);
    }
    
    public void fixHeapAbove(int i)
    {
        int  newValue=heap[i];
        while(i>0 && newValue>heap[getParent(i)])
        {
            heap[i]=heap[getParent(i)];
            i=getParent(i);
        }
        heap[i]=newValue;
    }
    
    private void fixHeapBelow(int i,int last_i)    //Last_i=size-1
    {
        int swap;
        while(i<=last_i)                       
        {
            int leftChild=getChild(i,true);
            int rightChild=getChild(i,false);
            
            if(leftChild<=last_i)         
            {
                if(rightChild>last_i)          //only left child exists
                {
                    swap=leftChild;
                }
                else                          //both the child exists
                {
                    swap=(heap[leftChild]>heap[rightChild]?leftChild:rightChild);
                }
                
                if(heap[i]<heap[swap])         //comparing parent node to the child ans swapping
                {
                    int temp=heap[i];
                    heap[i]=heap[swap];
                    heap[swap]=temp;
                }
                else
                {
                    break;
                }
                i=swap;
            }
            else                 //no child exists
            {
                break;
            }
     
        }
        
    }
    
    public void insert(int value)
    {
        if(isfull()==true)
            System.out.println("Full");
        
        heap[size]=value;
        fixHeapAbove(size);
        size++;
      
    }
    
    
    public void delete(int val)
    {
        if(isEmpty()==true)
            System.out.println("Empty Heap");
        
        int i,j;
        for(j=0;j<size;j++)
        {
            if(val==heap[j])
            {
                break;
            }    
        }
        i=j;
        
        int parent=getParent(i);
        int value=heap[i];
        
        heap[i]=heap[size-1];
        
        if(i==0 || heap[i]<heap[parent])
        {
            fixHeapBelow(i,size-1);
        }
        else
            fixHeapAbove(i);
        
        size--;
        System.out.println("Value deleted at position "+j);
        
    }
    
    public void peek()
    {
        if(isEmpty())
            System.out.println("Empty Heap");
        
        else
            System.out.println(heap[0]);
    }
    
    public void printHeap()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(heap[i]);
            System.out.print(",");
        }
        System.out.println("");
    }
}
