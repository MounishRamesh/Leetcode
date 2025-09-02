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
    public int deepestLeavesSum(TreeNode root) {
        int[] ls = new int[2] ;
        deep(root , 0 , ls) ;
        int a = Math.max(ls[0] , ls[1]) ;
        List<Integer> arr = new ArrayList<>() ;
        dsum(root , a, a , 0 , 0 , arr) ;
        int sum = 0 ;
        for(int i  : arr){
            sum += i ;
        }
        System.out.println(arr) ;
        return sum ;
    }
    public static void deep(TreeNode root , int i, int[] ls){
        if(root == null){
            return ;
        }
        if(root.left != null){
            ls[0] = Math.max(i+1 , ls[0]) ;
            deep(root.left , i+1 , ls); 
        } 
        if(root.right != null){
            ls[1] = Math.max(i+1 , ls[1]) ;
            deep(root.right , i+1 , ls) ;
        }
    }
    public static void dsum(TreeNode root , int i1 , int j1 , int i , int j , List<Integer> ls){
        if(root == null){
            return  ;
        }
        if(root.left == null && root.right == null){
            if(i1 == i || j1 == j){
                ls.add(root.val); 
            }
            return ;
        }
        System.out.println(i1 + " " +root.val+" " + j1 + " " +root.val) ;
        if(root.left != null){
            dsum(root.left , i1 , j1 , i+1 , j+1 , ls) ;
        }
        if(root.right != null){
            dsum(root.right, i1 , j1 , i+1 , j+1 , ls) ;
        }
    }
}