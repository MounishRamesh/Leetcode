// class Solution {
//     public int findShortestSubArray(int[] nums) {
//         HashMap<Integer , Integer> hs = new HashMap<>() ;
//         for(int i : nums){
//             hs.put(i , hs.getOrDefault(i,0)+1) ;
//         }
//         int max = 0 ;
//         ArrayList<Integer> ls = new ArrayList<>() ;
//         for(int i : hs.keySet()){
//             int j = hs.get(i) ;
//             if(j > max){
//                 ls.clear() ;
//                 ls.add(i);
//                 max = j ;
//             }
//             else if(j == max){
//                 ls.add(i) ;
//             }
//         }
//         int min = Integer.MAX_VALUE ;
//         int j = 0 ;
//         for(int k = 0 ;k < ls.size() ;k ++){
//             int val = ls.get(k) ;
//             int count = 0 ;
//             boolean ans = false ;
//             for(int i = 0 ;i < nums.length ;i ++){
//                 if(nums[i] == val && ans == false){
//                     j = i ;
//                     count ++ ;
//                     ans = true ;
//                 }
//                 else if(nums[i] == val){
//                     count ++ ;
//                 }
//                 if(count == max){
//                     System.out.println(j + " " + i) ;
//                     min = Math.min(min , (i-j)+1) ;
//                 }
//             }
//         }
//         return min ;
//     }
// }

class Solution {
    public int findShortestSubArray(int[] nums) {
        int max=0;
        for(int z:nums){
max=Math.max(max,z);
        }
       int[] count=new int[max+1];
       int[] x=new int[max+1];
       int[] y=new int[max+1];
       int degree=0;
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        count[num]++;
degree=Math.max(degree,count[num]);
        if(count[num]==1){
            x[num]=i;
        }
        y[num]=i;
    }
    int min=nums.length;
    for(int i=0;i<=max;i++){
if(count[i]==degree){
min=Math.min(min,y[i]-x[i]+1);
}
    }
    return min;
    }
}