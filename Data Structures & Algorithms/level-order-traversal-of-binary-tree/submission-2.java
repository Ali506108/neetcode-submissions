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

    //private final List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfsLevelOrder(root, 0 ,res  );
        return res;
    }

    private void dfsLevelOrder(TreeNode node , int depth , List<List<Integer>> res ) {
        if(node == null) return;
        if(depth == res.size() ) res.add(new ArrayList<>());

        res.get(depth).add(node.val);
        dfsLevelOrder(node.left , depth +1 , res);
        dfsLevelOrder(node.right , depth +1 , res );
    }
}
