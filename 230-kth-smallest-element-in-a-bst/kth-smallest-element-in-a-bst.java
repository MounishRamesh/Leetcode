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
    public int kthSmallest(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet<>() ;
        preorder(root , hs) ;
        int k1 = 1 ;
        for(int i : hs){
            if(k1 == k){
                return i ;
            }
            k1 ++ ;
        }
        return 0;
    }
    public static void preorder(TreeNode root , HashSet<Integer> hs){
        if(root == null){
            return ;
        }
        preorder(root.left , hs) ;
        hs.add(root.val) ;
        preorder(root.right , hs) ;
    }
}