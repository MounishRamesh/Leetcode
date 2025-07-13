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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>() ;
        preorder(ls , root); 
        return ls ;
    }
    public static void preorder(List<Integer> ls, TreeNode root){
        if(root == null){
            return  ;
        }
        ls.add(root.val) ;
        preorder(ls , root.left) ;
        preorder(ls , root.right) ;
    }
}