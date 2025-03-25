package traversal;

import java.io.*;

class Node{            // node initalize 
	int data;          //  node data
	Node left; 
	Node right;
	public int key;
	Node (int v ) 
	{
		this.data = v;
		this.left = this.right = null;
		
	}
	
}
class Traversal{
	// Inorder Traversal
	
    public static void printInorder(Node node) {
		if ( node == null)
			return;
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
    }
    
		
		
public static void main(String[] args) {
			// build the tree
			Node root = new Node(100);
			root.left = new Node(20);
			root.right = new Node(200);
			root.left.left = new Node(10);
			root.left.right = new Node(30);
			root.right.left = new Node(150);
			root.right.right = new Node(300);
			
			// Function call
			System.out.println("Inorder Traversal:");
			printInorder(root);   // as we know root because of that we can print value 
	}
	
	
}
