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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode curr = new TreeNode(val) ;
       if(root == null){
          root = curr ;
          return root ;
       }   
       if(root.val > val ){
          root.left =  (insertIntoBST(root.left , val)) ;
          return root ;
       }
       else{
          root.right = insertIntoBST(root.right , val) ;
          return root ;
       }

    }
}