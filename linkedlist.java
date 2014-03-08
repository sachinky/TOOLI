/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	public int data;
	public Node next;
	
	public Node (int d)
	{
		data =d;
	}
	
	public int read()
	{
		return(data);
	}
}

class list
{
	
	private Node head;
	
	public list()
	{
		head=null;
	}
	
	public boolean isEmpty() {
	    return head == null;
    }
	
	public void insert(int d)
	{
		Node node=new Node(d); 
		node.next=head;
		head=node;
		
	}
	
	public Node delete()
	{
		Node temp = head;
	    head = head.next;
	    return temp;
	}

	public void printList() {
	    Node currentLink = head;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    System.out.println(currentLink.read());
		    currentLink = currentLink.next;
	    }
	    System.out.println("");
    }
	
}

class LinkListTest {
    public static void main(String[] args) {
	    list list1 = new list();

	    list1.insert(1);
	    list1.insert(2);
	    list1.insert(3);
	    list1.insert(4);
	    list1.insert(5);

	    list1.printList();
	
	    while(!list1.isEmpty()) {
		    Node d = list1.delete();
		   
		    System.out.println("deleted: "+ d.read());
		   
	    }
	    list1.printList();
    }
}
