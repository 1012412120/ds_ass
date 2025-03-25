package linklist;
import java.io.*;
import java.util.*;

 class GFG {
	public static void
	printParents(int node, Vector<Vector<Integer>>adj, int parent)
	{
		if (parent ==0)
			System.out.println(node + "->Root");
		else
			System.out.println(node + "->" + parent);
		
		for (int i = 0; i < adj.get(node).size(); i++)
			if(adj.get(node).get(i) != parent)
				printParents(adj.get(node).get(i),adj,node);
	}
	public static void
	printChildren(int Root, Vector<Vector<Integer>>adj)
	{
		Queue<Integer> q = new LinkedList<>();
		
		q.add(Root);
		
		int vis[] = new int [adj .size()];
		
		Arrays.fill(vis, 0);
		
		while(q.size()!= 0) {
			int node =q.peek();
			q.remove();
			vis[node] =  1;
			System.out.println(node + "->");
			
			for (int i =0; i < adj.get(node).size(); i++) {
				if(vis [adj.get(node).get(i)]==0) {
					System.out.print(adj.get(node).get(i)+"");
					
					q.add(adj.get(node).get(i));
					
				}
			}
			System.out.println();
			
		}
		
	}
	public static void
	printLeafNodes(int Root, Vector<Vector<Integer>>adj)
	{
		for (int i = 1; i<adj.size(); i++)
			if (adj.get(i).size()== 1 && i != Root)
				System.out.print(i + "");
				
				System.out.println();
	}
	
	public static void 
	printDegrees(int Root, Vector<Vector<Integer>> adj) {
		for (int i = 1; i < adj.size(); i++ ) {
			System.out.print(i +":");
			
			if (i == Root)
				System.out.println(adj.get(i).size());
			else
				System.out.println(adj.get(i).size() - 1);
		}
	}
	public static void main(String[]args)
	{
		int N = 7, Root = 1;
		Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();
		for (int i = 0; i < N + 1; i++) {
			adj.add(new Vector<Integer>());
			
		}
		
		adj.get(1).add(2);
		adj.get(2).add(1);
		
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		adj.get(1).add(4);
		adj.get(4).add(1);
		
		adj.get(2).add(5);
		adj.get(5).add(2);
		
		adj.get(2).add(6);
		adj.get(6).add(2);
		
		adj.get(4).add(7);
		adj.get(7).add(4);
		
		System.out.println("The parents of each node are:");
		printParents(Root, adj, 0);
		
		System.out.println("The childern of each node are:");
		printParents(Root, adj, 0);
		
		System.out.println("The leaf nodes of the tree are:");
		printParents(Root, adj, 0);
		
		System.out.println("The degrees of each node are:");
		printParents(Root, adj, 0);
		
	}
		
	}
	
	


