//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jailyn Perales

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
       while(list != null){
           System.out.print(list.getValue() + " ");
           list = list.getNext();
       }
       //System.out.println(" ");
       
   }		
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	    int count=0;
   	    while(list != null){
            count ++;
            list = list.getNext();
        }
		return count;
		
	}
	
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
	    
	    ListNode add;
        add = new ListNode(list.getValue(),list.getNext());
        list.setNext(add);
	   
	}
	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
        ListNode curr = list;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        ListNode newNode = new ListNode(curr.getValue(),null);
        curr.setNext(newNode);
	}
		
	
	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
	    int count = 1;
	    while(count < x){
	        list = list.getNext();
	        count ++;
	    }
		list.setValue(value);
		
	}	
	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		ListNode current = list; 
		ListNode previous = null; 
		int count = 1; 
		
		if (x == 1) { 
		    if (current.getNext() == null) { 
		        list.setNext(null);  
		        return; 
		    } else { 
		      list.setNext(current.getNext().getNext());
		      current = current.getNext();   
		      count = 2;   
		      } 
		    
		} 
		
		while (current != null) {
		    if (count % x == 0) { 
		        if (previous != null) { 
		            previous.setNext(current.getNext()); 
		        } 
		        
		        current = current.getNext();  
		    }
		    else { 
		        previous = current; 
		        current = current.getNext(); 
		    } 
		    count++; 
		} 
	    
	} 
    


}		

