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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        //Base case: If you are in null node, you have reached your destination
        if(root == null){
            TreeNode tempNode = new TreeNode(val);
            root = tempNode;
            return root;
        }
        
        //If the value is greater than the current root, traverse right
        if(val > root.val) root.right = insertIntoBST(root.right, val);
        
        //If the value is less than the current root, traverse left
        if(val < root.val) root.left = insertIntoBST(root.left, val);
        
        return root;
        
    }
    
    
    /*
    Go through the tree recursively,
    if the node you are currently traversing is null, here is where your answer will go
    Go through the left or right subtree depending on which is appropriate according to the value given
    less than go left, bigger than go right
    */
    
    
}
