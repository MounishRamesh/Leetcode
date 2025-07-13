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
    public int maxDepth(TreeNode root) {
        int val = 0 ;
        int count  = inorder(root , 0) ;
        return count ;
    }
    public int inorder(TreeNode root , int i){
        if(root == null){
            return i ;
        }
        int a = inorder(root.left , i +1);
        int b = inorder(root.right , i +1) ;
        System.out.println(a+ " "+b) ;
        return (Math.max(a,b));
    }
}