package Driver;

import java.io.*;
 
// Class of the node
class Node
{
    int data;
    Node left, right;
    
  
    Node(int input)
    {
    	data = input;
        left = right = null;
    }
}
public class Main
{
    public static void main (String[] args)
    {
       //creating a BST
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);

       
       BSTToSkewedTree(node);
       traverse(headNode);
    }
    
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
   
  
    static void BSTToSkewedTree(Node root)
    {
    	if(root == null) return;
        
    	BSTToSkewedTree(root.left);
        
        Node rightNode = root.right;
        Node leftNode = root.left;
       
    
	        if(headNode == null)
		        {
		            headNode = root;
		            root.left = null;
		            prevNode = root;
		        }
	        else
		        {
		            prevNode.right = root;
		            root.left = null;
		            prevNode = root;
		        }

        BSTToSkewedTree(rightNode);
        
    }
   
    
    static void traverse(Node root)
    {
        if(root == null) return;
        
        System.out.print(root.data + " ");
        traverse(root.right);       
    }
   

}