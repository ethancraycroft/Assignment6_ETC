
/**
 * DepthFirstSearch.java
 * 
 * Includes a method to perform a Depth First Search starting at a binary tree's root node. Calculates the total number of nodes and traversals done through the search
 * 
 * @author Nathan Johnson, Bellarmine University
 * @author Ethan Craycroft
 * @version 1.0
 * 
 * CS-215-ON Assignment 6.1
 */
public class DepthFirstSearch 
{        
	   int nodeTraversals = 0; //counts each node as the search traverses to it
       Node root; 
       
       public DepthFirstSearch() 
       {
    	       System.out.println("Call DFS with root node to do a Depth First Search."); 
    	       nodeTraversals = 0;
       }//end empty-argument constructor
       
       /**
        * @param node - the node of the BST to be searched next
        * 
        * Traverses each node of a binary tree, prints the node's value, and counts total number of nodes/traversals
        */
       public void DFS(Node node)
       {
    	       System.out.println(node.getData()); 
	       nodeTraversals++;

    	       if(node.getlChild()!=null && node.getrChild()!=null)
    	       {
    		       DFS(node.getlChild());
    		       DFS(node.getrChild());
    	       }
       }//end DFS

}//end class

