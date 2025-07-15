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
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        Queue<TreeNode> q = new LinkedList<>() ;
        List<Integer> ls = new ArrayList<>() ;
        q.add(root) ;
        int a = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            TreeNode curr = q.poll() ;
            ls.add(curr.val) ;
            if(curr.left != null){
                q.add(curr.left) ;
            }
            if(curr.right != null){
                q.add(curr.right) ;
            }
        }
        Collections.sort(ls) ;
        int min = Integer.MAX_VALUE ;
        for(int i = 1 ;i < ls.size() ;i ++){
            int diff = Math.abs(ls.get(i) - ls.get(i-1)) ;
            min = Math.min(min , diff) ;
        }
        return min ;
    }
}