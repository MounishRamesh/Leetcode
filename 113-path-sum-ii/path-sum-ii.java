// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<List<Integer>> pathSum(TreeNode root, int tar) {
//         List<List<Integer>> ls = new ArrayList<>() ;
//         List<Integer> ls1 = new ArrayList<>() ;
//         path(root , tar , ls , ls1 , 0); 
//         System.out.println(ls) ;
//         return ls ;
//     }
//     public static void path(TreeNode root , int tar , List<List<Integer>> ls , List<Integer> ls1 , int sum){
//         if(root == null){
//             return ;
//         }
//         ls1.add(root.val) ;
//         sum += root.val ;
//         if(sum == tar && root.left == null && root.right == null){
//             ls.add(new ArrayList<>(ls1)) ;
//            // return ;
//         }
//         path(root.left , tar , ls , ls1 , sum) ;
//         path(root.right , tar , ls , ls1 , sum) ;
//         ls1.remove(ls1.size()-1) ;
//     }
// }

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
    public void helper(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path) {
        if(root == null) {
            return;
        }
        //checking leaf node
        if(root.left == null && root.right == null) {
            if(root.val == targetSum) {
                path.add(root.val);
                result.add(new ArrayList<>(path));
                path.remove(path.size()-1);
                return;
            }
        }
        targetSum = targetSum - root.val;
        path.add(root.val);
        helper(root.left, targetSum, result, path);
        helper(root.right, targetSum, result, path);
        //backtrack
        path.remove(path.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, targetSum, result, path);
        return result;
    }
}