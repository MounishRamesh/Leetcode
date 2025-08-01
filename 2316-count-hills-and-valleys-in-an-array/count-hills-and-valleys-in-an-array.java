// class Solution {
//     public int countHillValley(int[] nums) {
//         int count = 0 ;
//         if(nums.length <= 2){
//             return 0 ;
//         }
//         List<Integer> ls = new ArrayList<>() ;
//         int ind = 0 ;
//         for(int i = 0 ;i < nums.length-1 ;i ++){
//             if(nums[i] != nums[i+1]){
//                 ls.add(nums[i]) ;
//                 ind = i ;
//             }
//         }
//         if(nums[ind] != nums[nums.length-1]){
//             ls.add(nums[nums.length-1]) ;
//         }
//         for(int i = 1 ; i < ls.size()-1 ; i ++){
//             if(ls.get(i-1) > ls.get(i) && ls.get(i+1) > ls.get(i)){
//                 count ++ ;
//             }
//             else if(ls.get(i-1) < ls.get(i) && ls.get(i+1) < ls.get(i)){
//                 count ++ ;
//             }
//         }
//         System.out.println(ls) ;
//         return count ;
//     }
// }

class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int left=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                if((nums[i]>nums[left] && nums[i]>nums[i+1])||
                (nums[i]<nums[left]&& nums[i]<nums[i+1])){
                    count ++;
                }
                left=i;
            }
        }
        return count;
    }
}