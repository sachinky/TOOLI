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

public btree
{
	private Node root;
	
	public void btree()
	{
		root=null;
	}
	
	public void insert(int d)
	{
		node t=root;
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
	
	public void delete(int d)
	{
		
	}
}
