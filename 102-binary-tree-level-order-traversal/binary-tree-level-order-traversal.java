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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        if(root == null){
            return ls ;
        }
        q.add(root) ;
        
        while(!q.isEmpty()){
            List<Integer> ls1 = new ArrayList<>() ;
            int count = q.size() ;
            for(int i = 0 ; i < count ;i ++){
                TreeNode value = q.poll() ;
                ls1.add(value.val) ;
                if(value.left != null){
                    q.add(value.left) ;
                }
                if(value.right != null){
                    q.add(value.right) ;
                }
            }
            ls.add(ls1) ;
        }
        return ls ;
    }
}