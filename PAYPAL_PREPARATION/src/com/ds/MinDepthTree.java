package com.ds;

import javax.naming.BinaryRefAddr;
import javax.swing.text.html.MinimalHTMLWriter;

public class MinDepthTree {

	/**
	 * @param args
	 */
	
	public static int minimumDepth(BinaryTree root)
    {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;
 
        // Base case : Leaf Node. This accounts for height = 1.
        if (root.left == null && root.right == null)
            return 1;
 
        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minimumDepth(root.right) + 1;
 
        // If right subtree is NULL, recur for right subtree
        if (root.right == null)
            return minimumDepth(root.left) + 1;
 
        return Math.min(minimumDepth(root.left),
                        minimumDepth(root.right)) + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree( 3 );

	    int[] nums = {1,2,4,5};

	    for(int i : nums ) {

	    tree.addNode( i );

	    }
	   System.out.println(minimumDepth(tree));
	}

}
