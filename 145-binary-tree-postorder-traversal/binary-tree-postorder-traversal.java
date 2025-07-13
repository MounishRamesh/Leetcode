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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>() ;
        postorder(ls , root) ;
        return ls ;
    }
    public static void postorder(List<Integer> ls , TreeNode root){
        if(root == null){
            return ;
        }
        postorder(ls , root.left) ;
        postorder(ls , root.right) ;
        ls.add(root.val) ;
    }
}