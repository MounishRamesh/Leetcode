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
    public boolean hasPathSum(TreeNode root, int tar) {
        if(root == null){
            return false ;
        }
        if(path(root , 0 , tar)== 1){
            return true ;
        }
       // System.out.println(path(root , 0 , tar)); 
        return false ;
    }
    public static int path(TreeNode root , int sum , int tar){
        if(root == null){
            return 0 ;
        }
        sum += root.val ;
         if(root.left==null && root.right==null && sum == tar){
            return 1 ;
        }
        if(path(root.left , sum , tar) ==1)
        return 1;

        if(path(root.right , sum , tar)==1)
        return 1;

        return 0;
    }
}