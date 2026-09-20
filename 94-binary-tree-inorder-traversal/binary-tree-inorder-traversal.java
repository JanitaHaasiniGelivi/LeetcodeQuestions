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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        return ans;
    }
    void inOrder(TreeNode r,List<Integer> ans){
        if(r==null){
            return;
        }
        inOrder(r.left,ans);
        ans.add(r.val);
        inOrder(r.right,ans);


    }
}