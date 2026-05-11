/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root , TreeNode subroot) {
        if(root == null) return false;
        
        if(isSame(root ,subroot)) return true;
        
        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot);
    }

    private boolean isSame(TreeNode root , TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;

        return isSame(root.left , subRoot.left) &&
                isSame(root.right , subRoot.right);
    }
}