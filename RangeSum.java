public class RangeSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
		 * Output: 32
		 */
		
/*

			        			10
						5               15
				    3       7      NULL   	18 

*/
		
		//Building Binary Tree
		BinaryTree bt = new BinaryTree(10);
		bt.root.left = new TreeNode(5); 
        bt.root.right = new TreeNode(15);
        bt.root.left.left = new TreeNode(3); 
        bt.root.left.right = new TreeNode(7); 
        bt.root.right.right = new TreeNode(18);
        
		System.out.println(rangeSumBST(bt.root,7,15));
		
		//Display inOrder Traversal
		inOrder(bt.root);
		
	}
	
	public static class BinaryTree { 
		
	    // Root of Binary Tree 
	    TreeNode root; 
	  
	    // Constructors 
	    BinaryTree(int key) { 
	        root = new TreeNode(key); 
	    } 
	  
	    //Default Constructor
	    BinaryTree(){ 
	        root = null; 
	    } 
	    
	}
	
	public static class TreeNode {
		
		//Value of the node
		int val;
		
		//Children of the node
		TreeNode left;
		TreeNode right;
		
		//TreeNode Constructor
		TreeNode(int val) {
			this.val = val;
		}
		
	}
	
	//--------------------METHOD TO WRITE---------------------//
	public static int rangeSumBST(TreeNode root, int L, int R) {
	    
		//Sum Variable to keep track of sum as you go through
        int sum = 0;
        
        //Base case
        if(root == null){
            return 0;
        }
        
        /*
         * if statement checks to see if the current value being checked is in between 7 and 15
         * Since it's inOrder traversal for a binary tree, the values in between will be valid
         */
        if(root.val >= L && root.val <= R){
            sum =+ root.val;
        }
        
        //These recursively traverse the tree following inOrder traversal
        int lSum = rangeSumBST(root.left, L, R);
        int rSum = rangeSumBST(root.right, L, R);
       
        //Return total sum
        return sum + lSum + rSum;
        
    }
	
	
	//inOrder Traversal Code
	 private static void inOrder(TreeNode node) {
		 if (node == null) {
			 return; 
		 } 
		 inOrder(node.left); 
		 System.out.printf("%s ", node.val); 
		 inOrder(node.right);
		 
		 return;
	 }
	
	
}
