/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Node
{
	public int data;
	public Node c1;
	public Node c2;
	
	public Node(int d)
	{
		data=d;
	}
	
	public int read()
	{
		return data;
	}
}

class btree
{
	Node root;
	static int count;
	
	public void btree()
	{
		root=null;
	}
	 
	public void insert(int data)
	{ 
    	root = insert(root, data); 
  	} 
	
	private Node insert(Node node, int data) 
	{ 
    	if (node==null) 
    	{ 
      		node = new Node(data); 
    	} 
    	else 
    	{ 
      		if (data <= node.data) 
      		{ 
        		node.c1 = insert(node.c1, data); 
      		} 
      		else 
      		{ 
        		node.c2 = insert(node.c2, data); 
      		} 
    	}

    	return(node); 
  	} 
	
	public void print()
    {
        inorder(root);
    }
    public void inorder(Node node)
    {
        if(node!=null)
        {
            inorder(node.c1);
            System.out.println(node.data);
            inorder(node.c2);
        }
        else
            return;
    }

}

class BtreeTest {
    public static void main(String[] args) {
	    btree tree = new btree();

	    tree.insert(6);
	    tree.insert(9);
	    tree.insert(3);
	    tree.insert(7);
	    tree.insert(5);

	    tree.print();\\prints in inorder traversal

    }
}
