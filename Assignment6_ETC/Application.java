
/**
 * Application.java
 * 
 * Creates a practice tree and performs a Depth First Search on the created tree. Prints out the values of the tree's nodes, the total number of traversals that occurred, and the height of the created tree
 * @author Nathan Johnson, Bellarmine University
 * @author Ethan Craycroft
 * @version 1.0
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		System.out.println();
		
		System.out.println("1. Node values in the order they are traversed: "); aSearch.DFS(root); // performs the Depth First Search and outputs the value of each node as it is traversed 
		
		System.out.println();

		System.out.println("2. Number of traversals: " + aSearch.nodeTraversals); // prints out the total number of traversals that occurred during the Depth First Search
		
		System.out.println();

		System.out.println("3. Height of the tree: " + Math.log((aSearch.nodeTraversals) + 1)/Math.log(2)); // calculates the height of the tree by using the equation log2(n + 1) where n = total number of nodes
	}//end main

}//end class