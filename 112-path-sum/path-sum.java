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
        return path(root , 0 , tar);
            //return true ;
        //}
       // System.out.println(path(root , 0 , tar)); 
        // return false ;
    }
    public static boolean path(TreeNode root , int sum , int tar){
        if(root == null){
            return false ;
        }
        sum += root.val ;
         if (root.left == null && root.right == null) {
            return sum == tar;
        }
       return path(root.left , sum , tar) || path(root.right , sum , tar) ;
    }
}