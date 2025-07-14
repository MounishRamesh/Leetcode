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
    public boolean isBalanced(TreeNode root) {
        int val = recursion(root) ;
        if(val != -1){
            return true ;
        }
        return false ;
    }
    public int recursion(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int left = recursion(root.left) ;
        if(left == -1){
            return -1 ;
        }
        int right = recursion(root.right) ;
        if(right == -1){
            return -1;
        }
        System.out.println(left + " " + right) ;
        int diff = Math.abs(left - right) ;
        if(diff > 1){
            return -1;
        }
        return 1+Math.max(left , right);
        //return diff ;
    }
}