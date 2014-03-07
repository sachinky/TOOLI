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
	
	public void print()
	{
		System.out.println(data);
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
	
	public Node delete(int d)
	{
		Node node=head;
		while(node.next.next!=null)
		{
			if(node.next.data==d)
			{
				Node p=node.next;
				Node t=node.next.next;
				node.next=t;
				return p;
			}
			else
				node=node.next;
		}
		return null;
	}

	public void printList() {
	    Node currentLink = head;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.print();
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
		int i=5;
	    while(!list1.isEmpty()) {
		    Node deletedLink = list1.delete(i--);
		    System.out.print("deleted: "+deletedLink.data);
		   
	    }
	    list1.printList();
    }
}
