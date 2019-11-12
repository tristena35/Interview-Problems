/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    /*
    USE RIGHT-ROOT-LEFT    REVERESE OF INORDER
    */
    
    int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        
        //If Tree is empty
        if(root == null) return null;
    
        //Traverse the right subtrees
        bstToGst(root.right);
        
        //Keep track of the sum and update the value
        sum += root.val;
        root.val = sum;
        
        //Then traverse the left 
        bstToGst(root.left);
  
        
        return root;
    }
    
}