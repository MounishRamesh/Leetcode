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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root ;
        }
        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll() ;
            if(curr != null){
                TreeNode tem = curr.left ;
               TreeNode tem2 = curr.right ;
                curr.left = tem2 ;
                curr.right = tem ;
                q.add(tem2) ;
                q.add(tem) ;
            }
        }
        return root ;
    }
}