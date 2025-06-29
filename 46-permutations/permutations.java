// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ls = new ArrayList<>() ;
//         permute(nums , 0 , ls) ;
//         return ls ;
//     }
//     public static void permute(int[] nums , int i , List<List<Integer>> ls){
//         if(i == nums.length-1){
//             List<Integer> ls1 = new ArrayList<>() ;
//             for(int num : nums){
//                 ls1.add(num) ;
//             }
//             ls.add(ls1) ;
//         }
//         for(int j = i ; j < nums.length ; j ++){
//             swap(nums , j , i) ;
//             permute(nums , i+1 , ls) ;
//             swap(nums , j , i) ;
//         }
//     }
//     public static int[] swap(int[] nums , int i , int j){
//         int tem = nums[i] ;
//         nums[i] = nums[j] ;
//         nums[j] = tem ;
//         return nums ;
//     }
// }


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>() ;
        allPermutations(nums , 0 , ls) ;
        return ls;
    }
    public static void allPermutations(int[] nums , int i , List<List<Integer>> ls){
        if(i == nums.length-1){
            List<Integer> ls1 = new ArrayList<>() ;
            for(int i1 : nums){
                ls1.add(i1) ;
            }
            ls.add(ls1) ;
            return ;
        }
        for(int j = i ; j < nums.length ; j ++){
            isswap(nums , j , i) ;
            allPermutations(nums , i+1 , ls) ;
            isswap(nums , j , i) ;
        }
    }
    public static int[] isswap(int[] nums , int j , int i){
        int tem = nums[j] ;
        nums[j] = nums[i] ;
        nums[i] = tem ;
        return nums ;
    }
}