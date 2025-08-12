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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false ;
        }
        if(path(root , targetSum , 0)){
            return true; 
        }
        return false ;
    }
    public static boolean path(TreeNode root , int tar , int sum){
        if(root == null){
            return false ;
        }
        sum += root.val; 
        if(sum == tar&& root.left == null && root.right == null){
            return true ;
        }
        return (path(root.left , tar , sum) || path(root.right , tar , sum)) ;
    }
}