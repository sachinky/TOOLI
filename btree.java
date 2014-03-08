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
	
	public void btree()
	{
		root=null;
	}
	
	public void insert(int d)
	{
		Node t=root;
		if(root!=null)
		{
		
			while(t!=null)
			{
				if(d>t.data)
					t=t.c1;
				else
				t=t.c2;
			}
		}
		else
		{
			root=new Node(d);
			root.c1=null;
			root.c2=null;
		}
		
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

