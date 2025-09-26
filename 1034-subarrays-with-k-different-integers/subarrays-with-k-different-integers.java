class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count = 0 ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        HashMap<Integer , Integer> hs1 = new HashMap<>() ;
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1) ;
            while(hs.size() > k){
                hs.put(nums[j],hs.get(nums[j])-1) ;
                if(hs.get(nums[j])== 0){
                    hs.remove(nums[j]) ;
                }
                j ++ ;
            }
            System.out.println(i + " " + j) ;
            count += (i-j)+1 ;
        }
        int count1 = 0 ;
        int j1 = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            hs1.put(nums[i],hs1.getOrDefault(nums[i],0)+1) ;
            while(hs1.size() > k-1){
                hs1.put(nums[j1],hs1.get(nums[j1])-1) ;
                if(hs1.get(nums[j1])== 0){
                    hs1.remove(nums[j1]) ;
                }
                j1 ++ ;
            }
            count1 += (i-j1)+1 ;
        }
        System.out.println(count1) ;
        return Math.abs(count-count1) ;
    }
}