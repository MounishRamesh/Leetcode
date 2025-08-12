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
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        List<List<Integer>> ls = new ArrayList<>() ;
        List<Integer> ls1 = new ArrayList<>() ;
        path(root , tar , ls , ls1 , 0); 
        System.out.println(ls) ;
        return ls ;
    }
    public static void path(TreeNode root , int tar , List<List<Integer>> ls , List<Integer> ls1 , int sum){
        if(root == null){
            return ;
        }
        ls1.add(root.val) ;
        sum += root.val ;
        if(sum == tar && root.left == null && root.right == null){
            ls.add(new ArrayList<>(ls1)) ;
        }
        path(root.left , tar , ls , ls1 , sum) ;
        path(root.right , tar , ls , ls1 , sum) ;
        ls1.remove(ls1.size()-1) ;
    }
}