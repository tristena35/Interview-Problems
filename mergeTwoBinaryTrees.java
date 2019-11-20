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
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
                
        //Base cases:
        if(t1 == null) return t2; //If t1 is empty, check the other tree
        if(t2 == null) return t1; //If t2 is empty, check the other tree
        
        //Reset the value to their sum
        t1.val += t2.val;
            
        //Recursion calls
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        
        return t1;
        
    }
}
