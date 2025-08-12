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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList<>() ;
        totalview(root , ls , 0) ;
        return ls ;
    }
    public static void totalview(TreeNode root ,List<Integer> ls , int depth){
        if(root == null){
            return ;
        }
        if(depth == ls.size()){
            ls.add(root.val) ;
        }
       // System.out.println(depth + " "+ ls.size()) ;
        totalview(root.right , ls , depth+1) ;
        totalview(root.left , ls , depth+1) ;
    }
}