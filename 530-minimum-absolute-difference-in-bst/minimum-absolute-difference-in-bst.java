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
    int pre = -1;
    int min = Integer.MAX_VALUE ;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return min ;
        }
        getMinimumDifference(root.left) ;
        if(pre !=-1){
            min = Math.min(min , root.val-pre) ;
            pre = root.val ;
        }
        if(pre == -1){
            pre = root.val;
        }
        getMinimumDifference(root.right) ;
        return min; 
    }
}