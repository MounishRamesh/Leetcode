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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true ;
        }
        if((p == null || q == null) && (p!= null || q != null)){
            return false ;
        }
        Queue<TreeNode> q1 = new LinkedList<>() ;
        Queue<TreeNode> q2 = new LinkedList<>() ;
        q1.add(p) ;
        q2.add(q) ;
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode node1 = q1.poll() ;
            TreeNode node2 = q2.poll() ;
            System.out.println(node1.val + " " + node2.val ) ;
            if(node1.val != node2.val){
                // System.out.println(node1.val + " " + node2.val ) ;
                return false ;
            }
            if(node1.left != null && node2.left != null){
                q1.add(node1.left) ;
                q2.add(node2.left) ;
            }
            if(node1.right != null && node2.right != null){
                q1.add(node1.right) ;
                q2.add(node2.right) ;
            }
            if(node1.left == null && node2.left != null){
                return false ;
            }
            if(node1.right == null && node2.right != null){
                return false ;
            }
            if(node1.right != null && node2.right == null){
                return false ;
            }
            if(node1.left != null && node2.left == null ){
                return false ;
            }

        }
        return true ;
    }
}