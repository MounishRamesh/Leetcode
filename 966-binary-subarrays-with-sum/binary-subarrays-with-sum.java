// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         HashMap<Integer,Integer> hs = new HashMap<>() ;
//         int count = 0 ;
//         int sum = 0 ;
//         for(int i = 0 ; i< nums.length ;i ++){
//             sum = sum + nums[i] ;
//             if(sum == goal){
//                 count ++ ;
//             }
//             if(hs.containsKey(sum - goal)){
//                 count += hs.get(sum - goal) ;
//             }
//             if(hs.containsKey(sum)){
//                 hs.put(sum , hs.get((sum)) + 1) ;
//             }
//             else{
//                 hs.put(sum , 1) ;
//             }
//         }
//         return count ;
//     }
// }
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result = 0;
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            result += map.getOrDefault(prefixSum - goal, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }
        return result;
    }
}