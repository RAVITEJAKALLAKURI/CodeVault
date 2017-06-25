package com.ds;

import java.util.Stack;

public class KthSmallestinBST {

	/**
	 * @param args
	 */
	private static int counter;
	public static int kthSmallest(BinaryTree root, int k) {
	    Stack<BinaryTree> stack = new Stack<BinaryTree>();
	    BinaryTree p = root;
	    while(p!=null){
	        stack.push(p);
	        p=p.left;
	    }
	    int i=0;
	    while(!stack.isEmpty()){
	        BinaryTree t = stack.pop();
	        i++;
	 
	        if(i==k)
	            return t.data;
	 
	        BinaryTree r = t.right;
	        while(r!=null){
	            stack.push(r);
	            r=r.left;
	        }
	 
	    }
	 
	    return -1;
	}
	
	public static int kthLargest(BinaryTree root, int k) {
	    Stack<BinaryTree> stack = new Stack<BinaryTree>();
	    BinaryTree p = root;
	    while(p!=null){
	        stack.push(p);
	        p=p.right;
	    }
	    int i=0;
	    while(!stack.isEmpty()){
	        BinaryTree t = stack.pop();
	        i++;
	 
	        if(i==k)
	            return t.data;
	 
	        BinaryTree r = t.left;
	        while(r!=null){
	            stack.push(r);
	            r=r.right;
	        }
	 
	    }
	 
	    return -1;
	}
	
	
	private static  BinaryTree findKthLargestItem(BinaryTree rootNode, int k) {
		  if(rootNode==null){
		   return null;
		  }

		  //Instead of Left to Right, we will traverse in Right to Left fashion because largest element 
		  //are present of Right side of Root Node.
		  BinaryTree node = findKthLargestItem(rootNode.right, k);
		  
		  //If counter is not equal to K, then only increment the counter. 
		  //Once counter is equal to K, it means we have found the desired largest element and no need to increment further, 
		  //Take the back up of the current node as it might be the Kth largest element we are looking for.  
		  if(counter != k){
			   counter++;
			   node = rootNode;
			  }
		  
		  //This is the place where actual check is going to happen between counter and K, 
		  //If counter matched K, it means we found the node and no need to find further so simply return the found node.
		  if(k==counter){ 
		   return node;
		  }else{
		   return findKthLargestItem(rootNode.left, k);
		  }
		 }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinaryTree tree = new BinaryTree( 20 );

		    int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};

		    for(int i : nums ) {

		    tree.addNode( i );

		    }
		    
		   System.out.println(kthSmallest(tree,10));
		   System.out.println(kthLargest(tree,4));
		   
		  System.out.println( findKthLargestItem(tree, 4).data);

	}

}
