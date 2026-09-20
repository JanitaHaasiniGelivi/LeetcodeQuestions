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
    TreeNode minValNode(TreeNode node){
        TreeNode current = node;
        while(current.left!=null){
            current=current.left;
        }
        return current;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        //searching data
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        // i found the node
        else{
            //no childpapa
            if(root.left==null && root.right==null){
                return null;
            }
            //one childright
            else if(root.left==null){
                return root.right;
            }
            //one childleft
            else if(root.right==null){
                return root.left;
            }
            //both childd 
            else{
                TreeNode minNode = minValNode(root.right);
                root.val=minNode.val;
                root.right = deleteNode(root.right,minNode.val);
            }
        }
        return root;

    }
}